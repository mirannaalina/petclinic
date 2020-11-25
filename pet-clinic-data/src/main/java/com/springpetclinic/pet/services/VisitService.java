package com.springpetclinic.pet.services;

import com.springpetclinic.pet.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface VisitService extends CrudService<Visit, Long> {
}
