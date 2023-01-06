package com.cucumber.demo.service.impl;

import com.cucumber.demo.model.User;
import com.cucumber.demo.repository.UserRepository;
import com.cucumber.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,Integer> implements UserService {

    public UserServiceImpl(UserRepository r) {
        super(r);
    }
}
