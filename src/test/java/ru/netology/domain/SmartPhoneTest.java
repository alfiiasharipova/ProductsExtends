package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartPhoneTest {

    @Test
    void shouldMatchesTrue() {
        SmartPhone smartPhone = new SmartPhone(1, "Java", "test");
        assertTrue(smartPhone.matches("test"));
    }

    @Test
    void shouldMatchesFalse() {
        SmartPhone smartPhone = new SmartPhone(1, "Java", "test");
        assertFalse(smartPhone.matches("notTest"));
    }
}