package com.springpetclinic.pet.services;


import com.springpetclinic.pet.model.Owner;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
