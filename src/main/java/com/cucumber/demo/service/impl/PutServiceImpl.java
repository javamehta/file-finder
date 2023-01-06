package com.cucumber.demo.service.impl;

import com.cucumber.demo.model.Put;
import com.cucumber.demo.repository.PutRepository;
import com.cucumber.demo.service.PutService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PutServiceImpl extends BaseServiceImpl<Put,Integer> implements PutService {
    public PutServiceImpl(PutRepository r) {
        super(r);
    }
}
