package com.hinkle.sfgpetclinic.services.map;

import com.hinkle.sfgpetclinic.model.Pet;
import com.hinkle.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Pet save(Pet type) {
    return this.save(type.getId(), type);
  }

  @Override
  public void delete(Pet type) {
    super.delete(type);
  }

  @Override
  public void deleteByID(Long id) {
    super.deleteById(id);
  }
}
