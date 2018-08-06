package com.hinkle.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, Id> {

  protected Map<Id, T> map = new HashMap();

  Set<T> findAll(){
    return new HashSet<>(map.values());
  }

  T findById(Id id){
    return map.get(id);
  }

  T save(Id id, T type){
    map.put(id, type);
    return type;
  }

  void deleteById(Id id){
    map.remove(id);
  }

  void delete(T type){
    map.entrySet().removeIf(entry -> entry.getValue().equals(type));
  }

}
