package ru.netology.manager;

import ru.netology.main.Product;
import ru.netology.main.Repository;

public class ProductManager {

    private Repository repository;

    public ProductManager(Repository repository){
        this.repository = repository;
    }

    public void add(Product product){
        repository.save(product);
    }

    public void removeById(int id){
        repository.removeById(id);
    }

    public boolean matches(Product product, String search) {
        return product.getName().contains(search);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }
}

