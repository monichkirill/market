package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Component
public class Security {
    private Long id;
    private String login;
    private String password;
    public Role role;
    public Timestamp created;
    public Timestamp updated;
    private Long userId;
}
