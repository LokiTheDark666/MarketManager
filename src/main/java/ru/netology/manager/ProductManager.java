package ru.netology.manager;

import ru.netology.main.Product;

public class ProductManager {
    private Product[] products = new Product[0];

    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }


    public Product[] searchBy(String id) {
        Product[] results = new Product[0];

        for (Product product : products) {
            if (product.matches(id)) {
                Product[] tmp = new Product[results.length + 1];
                for (int i = 0; i < results.length; i++) {
                    tmp[i] = results[i];
                }
                tmp[tmp.length - 1] = product;
                results = tmp;

            }

        }
        return results;
    }

    public boolean matches(Product product, String id) {
        return product.getId().contains(id);


    }
}





