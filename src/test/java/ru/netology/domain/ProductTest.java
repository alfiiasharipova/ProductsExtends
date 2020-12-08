package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void shouldMatchesTrue() {
        Book book = new Book(1, "Java", "test");
        assertTrue(book.matches("Java"));
    }

    @Test
    void shouldMatchesFalse() {
        Book book = new Book(1, "Java", "test");
        assertFalse(book.matches("Python"));
    }
}