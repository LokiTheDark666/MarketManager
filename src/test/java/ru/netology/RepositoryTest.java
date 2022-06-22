package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ru.netology.manager.NotFoundException;
import ru.netology.manager.ProductManager;
import ru.netology.main.Repository;
import ru.netology.main.Book;
import ru.netology.main.Product;
import ru.netology.main.Smartphone;

public class RepositoryTest {

    private Repository repository = new Repository();


    private Product pro1 = new Book(01,150,"StarWars","Lucas");
    private Product pro2 = new Book(02, 200,"Purgatory","Tarmashev");
    private Product pro3 = new Smartphone(03,5000,"Nokia","Taivan");
    private Product pro4 = new Smartphone(04,6000,"Samsung","China");

    @BeforeEach
    public void setUp() {
        repository.save(pro1);
        repository.save(pro3);
    }

    @Test
    public void shouldSaveProducts() {
        repository.save(pro1);
        Product[] actual = repository.findAll();
        Product[] expected = {pro1,pro3,pro1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeById() {
        repository.removeById(01);
        Product[] actual = repository.findAll();
        Product[] expected = {pro3};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldNotFoundException() {
        Assertions.assertThrows(NotFoundException.class, () -> {
            repository.removeById(-1);
        });
    }
}
