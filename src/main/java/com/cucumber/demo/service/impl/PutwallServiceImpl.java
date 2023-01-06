package com.cucumber.demo.service.impl;

import com.cucumber.demo.model.Putwall;
import com.cucumber.demo.repository.PutwallRepository;
import com.cucumber.demo.service.PutwallService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PutwallServiceImpl extends BaseServiceImpl<Putwall,Integer>  implements PutwallService {
    public PutwallServiceImpl(PutwallRepository r) {
        super(r);
    }
}
