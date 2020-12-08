package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void matchesTrue() {
        Book book = new Book(1, "Java", "test");
        assertTrue(book.matches("test"));
    }

    @Test
    void matchesFalse() {
        Book book = new Book(1, "Java", "test");
        assertFalse(book.matches("notTest"));
    }
}