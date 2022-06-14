package ru.netology.main;

import ru.netology.manager.ProductManager;

public class Main {
    static ProductManager manager = new ProductManager();

    public static void main(Product[] args ){

        manager.add(new Book("01",100,"Starwars","Lucas"));
        manager.add(new Smartphone("02",5000,"nokia","Tailand"));
    }
}
