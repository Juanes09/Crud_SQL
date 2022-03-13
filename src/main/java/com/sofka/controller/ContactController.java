package com.sofka.controller;

import com.sofka.domain.Contact;
import com.sofka.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;


     @GetMapping(path = "/users")
    public List<Contact> listContacts(){
         //var contacs = contactService.list();
        return contactService.list();
    }
    @PostMapping(path = "/user")
    public void createData(){

    }
    @DeleteMapping(path  = "/user/{id}")
    public void deleteData(){

    }

    @PutMapping(path = "/user/{id}")
    public void modifyData(){

    }

    @PatchMapping(path = ("/user/name/{id}"))
    public void modifyName(){

    }




}
