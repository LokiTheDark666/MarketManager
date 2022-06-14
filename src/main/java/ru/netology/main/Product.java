package ru.netology.main;


import java.util.Collection;

public class Product {


    protected String id;
    protected int sum;
    protected String name;

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String id, int sum, String name) {
        this.id = id;
        this.sum = sum;
        this.name = name;
    }

    public boolean matches(String id) {
        return false;
    }


}


