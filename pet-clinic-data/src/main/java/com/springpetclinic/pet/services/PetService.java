package com.springpetclinic.pet.services;

import com.springpetclinic.pet.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
