package com.springpetclinic.pet.repositories;

import com.springpetclinic.pet.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {




}
