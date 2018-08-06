package com.hinkle.sfgpetclinic.services.map;

import com.hinkle.sfgpetclinic.model.Owner;
import com.hinkle.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public Owner findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Owner save(Owner type) {
    return this.save(type.getId(), type);
  }

  @Override
  public void delete(Owner type) {
    super.delete(type);
  }

  @Override
  public void deleteByID(Long id) {
    super.deleteById(id);
  }
}
