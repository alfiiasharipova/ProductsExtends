package ru.netology.domain;

public class Product {
  private int id;
  private String name;
  private int price;

  public Product() {
  }

  public Product(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean matches(String search) {
    return this.getName().equalsIgnoreCase(search);
  }

}
