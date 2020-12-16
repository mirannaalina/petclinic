package com.springpetclinic.pet.repositories;

import com.springpetclinic.pet.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastname);

    List<Owner> findAllByLastNameLike(String lastName);


}
