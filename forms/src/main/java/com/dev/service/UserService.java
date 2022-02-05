package com.dev.service;

import java.util.List;

import com.dev.domain.User;
import com.dev.domain.UserCreationParameters;

import org.springframework.stereotype.Component;



@Component
public interface UserService {

    User createUser(UserCreationParameters parameters);

    List<User> getUsers();
}
