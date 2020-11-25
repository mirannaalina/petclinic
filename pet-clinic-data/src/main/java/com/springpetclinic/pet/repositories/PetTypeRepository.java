package com.springpetclinic.pet.repositories;

import com.springpetclinic.pet.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {


}
