package com.cucumber.demo.repository;

import com.cucumber.demo.model.Putwall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PutwallRepository extends JpaRepository<Putwall,Integer> {
}
