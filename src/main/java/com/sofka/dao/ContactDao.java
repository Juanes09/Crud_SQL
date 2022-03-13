package com.sofka.dao;

import  com.sofka.domain.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao extends CrudRepository<Contact, Long>  {
}
