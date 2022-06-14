package ru.netology.main;

public class Smartphone extends Product {

    private String manufacturer;

    public Smartphone(String id, int sum, String name, String manufacturer) {
        super(id, sum, name);
        this.manufacturer = manufacturer;
    }
}
