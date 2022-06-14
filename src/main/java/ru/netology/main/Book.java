package ru.netology.main;

public class Book extends Product {

    private String author;


    public Book(String id, int sum, String name, String author) {
        super(id, sum, name);
        this.author = author;
    }
}



