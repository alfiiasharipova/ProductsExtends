package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.SmartPhone;


import static org.junit.jupiter.api.Assertions.*;

class ProductsManagerTest {
    Book first = new Book(1, "Java", "test");
    Book second = new Book(2, "Java", "test");
    SmartPhone third = new SmartPhone(3, "A30", "test");
    ProductsManager manager;

    @BeforeEach
    public void setUp(){
        Product[] products = {first, second, third};
        manager = new ProductsManager(products);
    }

    @Test
    public void shouldFindAllProducts() {
        Product[] expected = {first, second, third};
        Product[] result = manager.searchBy("test");
        assertArrayEquals(expected,result);
    }

    @Test
    public void shouldFindOneProducts() {
        Product[] expected = {third};
        Product[] result = manager.searchBy("A30");
        assertArrayEquals(expected,result);
    }

    @Test
    public void shouldNotFindProducts() {
        Product[] result = manager.searchBy("Python");
        assertEquals(0,result.length);
    }
}