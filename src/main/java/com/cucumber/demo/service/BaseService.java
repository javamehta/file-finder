package com.cucumber.demo.service;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID> {
    <S extends T> S save(S entity);
    <S extends T> Iterable<S> saveAll(Iterable<S> entities);
    Optional<T> findById(ID id);
    void removeById(ID id);
    <S extends T> List<T> findAll();
}
