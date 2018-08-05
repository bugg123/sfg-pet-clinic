package com.hinkle.sfgpetclinic.services;

import com.hinkle.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

  Pet findById(String id);

  Pet save(Pet pet);

  Set<Pet> findAll();

}
