package com.dev.controllers;

import javax.validation.Valid;

import com.dev.domain.CreateUserFormData;
import com.dev.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    
    @Autowired
    private  UserService service;

    // // autowired also can be used as below
    // private final UserService service;

    // public UserController(UserService service) {
    // this.service = service;
    // }

    @GetMapping("/create")
    public String showCreateUserForm(Model model) {
        model.addAttribute("formData", new CreateUserFormData());
        return "users/create";
    }

    @PostMapping("/create")
    public String doCreateUser(@Valid @ModelAttribute("formData") CreateUserFormData formData,
            BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "users/create";
        }

        service.createUser(formData.toParameters());
        return "redirect:/users/list";
    }

    @GetMapping
    public String listUsers(Model model) {
        model.addAttribute("users", service.getUsers());
        return "users/list";
    }

}
