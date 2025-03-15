package com.tms.config;

public interface SQLQuery {
    String CREATE_USER = "INSERT INTO users (id, firstname, second_name, age, telephone_number, email, created, updated, sex, is_deleted) " +
            "VALUES (DEFAULT, ?, ?, ?, ?, ?, DEFAULT, ?, ?, ?)";
    String CREATE_SECURITY = "INSERT INTO security (id, login, password, role, created, updated, user_id) " +
            "VALUES (DEFAULT, ?, ?, ?, DEFAULT, ?, ?)";
}
