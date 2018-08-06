package com.hinkle.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

  Set<T> findAll();

  T findById(ID id);

  T save(T type);

  void delete(T type);

  void deleteByID(ID id);

}
