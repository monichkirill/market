package com.tms.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class Product {
    private Integer id;
    private String name;
    private Double price;
    private Timestamp created;
    private Timestamp updated;
}
