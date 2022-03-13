package com.sofka.controller;

import com.sofka.domain.Contact;
import com.sofka.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;


     @GetMapping(path = "/users")
    public List<Contact> listContacts(){
        return contactService.list();
    }


    @PostMapping(path = "/user")
    public ResponseEntity<Contact>createData(Contact contact){
      log.info("Create contact  : {}" , contact);
      contactService.saveData(contact);
      return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }



    @DeleteMapping(path  = "/user/{id}")
    public  ResponseEntity<Contact>deleteData(Contact contact){
         log.info("Contact to delete : {}" , contact);
         contactService.deleteData(contact);
         return new ResponseEntity<>(contact,HttpStatus.OK);


    }

    @PutMapping(path = "/user/{id}")
    public  ResponseEntity<Contact> modifyData(Contact contact, @PathVariable("id") Long id){
         log. info("Contact to modify :  {} " , contact );
         contactService.updateData(id, contact);
         return new ResponseEntity<>(contact, HttpStatus.ACCEPTED);
    }

    @PatchMapping(path = ("/user/name/{id}"))
    public ResponseEntity<Contact> modifyName(Contact contact, @PathVariable("id") Long id){
         log.info("name contact to modify : {}" , contact);
        contactService.updateDataName(id , contact);
        return new  ResponseEntity<>(contact , HttpStatus.OK);
    }
    @PatchMapping(path = ("user/phone/{id}"))
    public ResponseEntity<Contact>modifyNumberPhone(Contact contact, @PathVariable("id") Long id){
    log.info("Number phone to modify : {}" , contact);
    contactService.updateNumberPhone(id, contact);
    return new ResponseEntity<>(contact,HttpStatus.ACCEPTED);
    }
    @PatchMapping(path = ("user/email/{id}"))
    public ResponseEntity<Contact>modifyEmail(Contact contact , @ PathVariable("id") Long id){
         log. info("Email to change :{}" , contact);
         contactService.updateEmail(id, contact);
         return new ResponseEntity<>(contact, HttpStatus.ACCEPTED);
    }

}
