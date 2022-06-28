package org.example;

public class Author {
    private String name;
    private Book[] aBookElement = new Book[0];

    public Author(String name, Book[] aBookElement) {
        this.name = name;
        this.aBookElement = aBookElement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getaBookElement() {
        return aBookElement;
    }

    public void setaBookElement(Book[] aBookElement) {
        this.aBookElement = aBookElement;
    }

}
