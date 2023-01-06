package com.cucumber.demo.repository;

import com.cucumber.demo.model.Put;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PutRepository extends JpaRepository<Put, Integer> {
}
