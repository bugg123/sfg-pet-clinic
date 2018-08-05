package com.hinkle.sfgpetclinic.services;

import com.hinkle.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

  Vet findById(String id);

  Vet save(Vet pet);

  Set<Vet> findAll();
}
