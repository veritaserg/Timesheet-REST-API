package com.timesheet.service;

import java.util.List;

public interface GenericService<T, ID> {

    T save(T t);

    List<T> findAll();

    T findById(ID id);

    void delete(T t);

    void deleteById(ID id);
  }
