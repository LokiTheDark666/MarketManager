package ru.netology.main;

import lombok.Data;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor



public class Product {


    protected int id;
    protected int sum;
    protected String name;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



}


