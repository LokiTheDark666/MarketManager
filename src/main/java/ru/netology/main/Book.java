package ru.netology.main;

public class Book extends Product {

    private String author;


    public Book(int id, int sum, String name, String author) {
        super(id, sum, name);
        this.author = author;
    }
}



