package com.springpetclinic.pet.repositories;

import com.springpetclinic.pet.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VisitRepository extends CrudRepository<Visit, Long> {


}
