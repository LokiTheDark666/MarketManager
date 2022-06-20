package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ru.netology.manager.ProductManager;
import ru.netology.main.Repository;
import ru.netology.main.Book;
import ru.netology.main.Product;
import ru.netology.main.Smartphone;


public class ProductManagerTest {
    private Repository repository = new Repository();
    private ProductManager manager = new ProductManager(repository);

    private Product pro1 = new Book(01,150,"StarWars","Lucas");
    private Product pro2 = new Book(02, 200,"Purgatory","Tarmashev");
    private Product pro3 = new Smartphone(03,5000,"Nokia","Taivan");
    private Product pro4 = new Smartphone(04,6000,"Samsung","China");


    @BeforeEach
    public void setUp() {
        manager.add(pro1);
        manager.add(pro2);
        manager.add(pro3);
        manager.add(pro4);
    }

    @Test
    public void shouldAddProduct() {
        manager.add(pro1);
        Product[] actual = repository.findAll();
        Product[] expected = {pro1, pro2, pro3, pro4,pro1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        manager.removeById(1);
        Product[] actual = repository.findAll();
        Product[] expected = {pro2, pro3, pro4};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchProductByName() {
        Product[] actual = manager.searchBy("Purgatory");
        Product[] expected = {pro2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchOneByTextInName() {
        Product[] actual = manager.searchBy("kia");
        Product[] expected = {pro3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNoProduct() {
        Product[] actual = manager.searchBy("aaa");
        Product[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldEmptyRepository(){
        manager.removeById(1);
        manager.removeById(2);
        manager.removeById(3);
        manager.removeById(4);
        Product[] actual = repository.findAll();
        Product[] expected = {};
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldOneElements(){
        manager.removeById(1);
        manager.removeById(2);
        manager.removeById(3);
        Product[] actual = repository.findAll();
        Product[] expected = {pro4};
        Assertions.assertArrayEquals(expected,actual);
    }
}


