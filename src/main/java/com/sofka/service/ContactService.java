package com.sofka.service;

import com.sofka.dao.ContactDao;
import com.sofka.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class ContactService implements IContactService {


 @Autowired
    private ContactDao contactDao;


    @Override
    @Transactional(readOnly = true)
    public List<Contact> list() {
        try {
            return (List<Contact>) contactDao.findAll();
        }catch (Exception e) {
            System.out.println("Este es el error " + e);
            return null;
        }
    }

    @Override
    @Transactional
    public Contact saveData(Contact contact) {
        return contactDao.save(contact);
    }

    @Override
    @Transactional
    public Contact updateData(Long id, Contact contact) {
        contact.setId(id);
        return contactDao.save(contact);
    }

    @Override
    @Transactional
    public void deleteData(Contact contact) {
       contactDao.delete(contact);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Contact> findData(Contact contact) {
        return contactDao.findById(contact.getId());
    }


}
