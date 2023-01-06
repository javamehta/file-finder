package com.cucumber.demo.service.impl;

import com.cucumber.demo.repository.UserRepository;
import com.cucumber.demo.service.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class BaseServiceImpl<T,ID> implements BaseService<T,ID> {
    JpaRepository r;

    public <S extends T> BaseServiceImpl(JpaRepository r) {
        this.r=r;
    }

    @Override
    public <S extends T> S save(S entity) {
        return (S) r.save(entity);
    }

    @Override
    public <S extends T> Iterable<S> saveAll(Iterable<S> entities) {
        return r.saveAll(entities);
    }

    @Override
    public Optional<T> findById(ID id) {
        return r.findById(id);
    }

    @Override
    public void removeById(ID id) {
        r.deleteById(id);
    }

    @Override
    public <S extends T> List<T> findAll() {
        return r.findAll();
    }

}
