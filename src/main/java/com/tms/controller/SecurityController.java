package com.tms.controller;

import com.tms.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/security")
public class SecurityController {

    public SecurityService securityService;

    @Autowired
    public SecurityController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @GetMapping("/{id}")
    public String registration() {
        return "registration";
    }

    //Create Read Update Delete

    @PostMapping("/registration")
    public String registration(
            @RequestParam(value = "firstname", required = false) String firstname,
            @RequestParam(value = "secondName", required = false) String secondName,
            @RequestParam(value = "age", required = false) Integer age,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "sex", required = false) String sex,
            @RequestParam(value = "telephoneNumber", required = false) String telephoneNumber,
            @RequestParam(value = "login", required = false) String login,
            @RequestParam(value = "password", required = false) String password
    ) {
        Boolean result = securityService.registration(firstname, secondName, age, password, telephoneNumber, email, sex, login);

        return "user";
    }
}
