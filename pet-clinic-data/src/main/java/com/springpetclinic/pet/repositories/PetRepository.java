package com.springpetclinic.pet.repositories;

import com.springpetclinic.pet.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
