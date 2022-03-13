package com.sofka.domain;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;


@Data
@Entity
@Table(name = "contact" )
public class Contact implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contact")
    private  Long id;

    @Column(name =  "name_contact")
    private String name;

    @Column(name =  "phone_number")
    private String phone;

    @Column(name =  "email_contact")
    private String email;

    @Column(name =  "birth_date")
    private String birth;

}

