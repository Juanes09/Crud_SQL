package com.sofka.dao;

import  com.sofka.domain.Contact;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface ContactDao extends CrudRepository<Contact, Long>  {

    @Modifying
    @Query("update Contact cont set cont.name = :name where  cont.id = :id")
    public void updateDataName(@Param(value = "id")Long id,
                                  @Param(value = "name")String name);


    @Modifying
    @Query("update Contact cont set cont.phone = :phone where  cont.id = :id")
    public void updateNumberPhone(@Param(value = "id")Long id,
                               @Param(value = "phone")String phone);

@Modifying
@Query("update Contact cont set cont.email = :email where  cont.id = :id")
    public void updateEmail(@Param(value = "id") Long id,
                            @Param(value = "email") String email);
}