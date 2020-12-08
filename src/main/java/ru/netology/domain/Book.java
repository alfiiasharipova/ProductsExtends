package ru.netology.domain;

public class Book extends Product {
  private String author;

  public Book() {
    super();
  }

  public Book(int id, String name, String author) {
    super(id, name);
    this.author = author;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public boolean matches(String search) {
    if (super.matches(search))
      return true;
    return this.getAuthor().equalsIgnoreCase(search);
  }

}
