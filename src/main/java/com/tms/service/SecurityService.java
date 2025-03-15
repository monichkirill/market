package com.tms.service;

import com.tms.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class SecurityService {

    public final SecurityRepository securityRepository;

    @Autowired
    public SecurityService(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    public Boolean registration(String firstName, String secondName, Integer age, String password, String telephoneNumber,
                                String email, String sex, String login) {
        try {
            return securityRepository.registration(firstName, secondName, age, password, telephoneNumber, email, sex, login);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
