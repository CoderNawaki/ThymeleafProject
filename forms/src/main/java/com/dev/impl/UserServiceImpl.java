package com.dev.impl;

import java.util.List;

import com.dev.domain.User;
import com.dev.domain.UserCreationParameters;
import com.dev.repo.UserRepository;
import com.dev.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private  UserRepository repository;

    public UserServiceImpl(){}

    public UserServiceImpl(UserRepository repository){
        this.repository=repository;
    }

    @Override
    public User createUser(UserCreationParameters parameters) {
        User user = new User(parameters.getGivenName(), parameters.getFamilyName());

        return repository.save(user);
    }

    @Override
    public List<User> getUsers() {

        return repository.findAll();
    }

}
