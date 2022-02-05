package com.dev.impl;

import java.util.List;

import javax.transaction.Transactional;

import com.dev.domain.User;
import com.dev.domain.UserCreationParameters;
import com.dev.repo.UserRepository;
import com.dev.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {


    @Autowired
    private  UserRepository repository;


    @Transactional
    public User createUser(UserCreationParameters parameters) {
        User user = new User(parameters.getGivenName(), parameters.getFamilyName());

        return repository.save(user);
    }

    @Transactional
    public List<User> getUsers() {

        return repository.findAll();
    }

}
