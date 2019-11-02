package com.epam.homework5;

import java.util.Scanner;

public class Book {
    private int ID;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double price;

    public Book(int ID, String name, String author, String publisher, int year, int pages, double price) {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void view() {
        System.out.println("ID = " + this.ID + " |  Name = " + this.name + " |  Author = " + this.author + " |  Publisher = " +
                this.publisher + " |  Year = " + this.year + " |  Pages = " + this.pages + " |  Price = " + this.price);
    }

        public Book(int i){
            this.ID = i;
            this.name = "";
            this.author = "";
            this.publisher = "";
            this.year = 0;
            this.pages = 0;
            this.price = 0.0;
        }
        public Book(){

        }
}
