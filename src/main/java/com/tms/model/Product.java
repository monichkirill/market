package com.tms.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Product {
    private int id;
    private String name;
    private double price;
}
