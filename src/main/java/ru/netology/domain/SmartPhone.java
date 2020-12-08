package ru.netology.domain;

public class SmartPhone extends Product {
    private String brand;

    public SmartPhone() {
        super();
    }

    public SmartPhone(int id, String name, String brand) {
        super(id, name);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
