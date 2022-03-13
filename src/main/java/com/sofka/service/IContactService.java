package com.sofka.service;
import com.sofka.domain.Contact;
import java.util.List;
import java.util.Optional;



public interface IContactService {

    List<Contact> list();

    public Contact saveData(Contact contact);

    public Contact updateData(Long id , Contact contact);

    public void deleteData(Contact contact);

    public Optional<Contact> findData(Contact contact);
}
