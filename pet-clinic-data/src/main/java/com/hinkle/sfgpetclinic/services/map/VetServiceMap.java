package com.hinkle.sfgpetclinic.services.map;

import com.hinkle.sfgpetclinic.model.Vet;
import com.hinkle.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Vet save(Vet type) {
    return this.save(type.getId(), type);
  }

  @Override
  public void delete(Vet type) {
    super.delete(type);
  }

  @Override
  public void deleteByID(Long id) {
    super.deleteById(id);
  }
}
