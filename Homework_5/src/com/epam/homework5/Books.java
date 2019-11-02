package com.epam.homework5;

import java.util.Scanner;

public class Books {
    Book[] arrayOfBooks;
    private int length;

    public Books(Book[] arrayOfBooks, int length) {
        this.arrayOfBooks = arrayOfBooks;
        this.length = length;
    }

    public Book[] getArrayOfBooks() {
        return arrayOfBooks;
    }

    public void setArrayOfBooks(Book[] arrayOfBooks) {
        this.arrayOfBooks = arrayOfBooks;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Books(int lengthArray) {
        this.length = lengthArray;
        this.arrayOfBooks = new Book[lengthArray];

       /* Action for console input of each Book
        for (int i = 0; i < arrayOfBooks.length; i++) {
            arrayOfBooks[i] = addNewBook();
        }*/

       Book[] arrayOfBooks = {
               new Book (1, "Book1", "Author1", "Publisher1", 2018, 250, 115.35),
               new Book (2, "Book2", "Author2", "Publisher2", 2017, 100, 210.80),
               new Book (3, "Book3", "Author1", "Publisher3", 2005, 756, 108.75),
               new Book (4, "Book4", "Author3", "Publisher3", 2019, 328, 65.40),
               new Book (5, "Book5", "Author3", "Publisher2", 2001, 105, 112.00),
               new Book (6, "Book6", "Author4", "Publisher4", 2018, 470, 107.80),
               new Book (7, "Book7", "Author1", "Publisher5", 2007, 108, 96.55),
               new Book (8, "Book8", "Author2", "Publisher1", 2007, 236, 115.35),
               new Book (9, "Book9", "Author5", "Publisher3", 2010, 112, 104.60),
               new Book (10, "Book10", "Author4", "Publisher6", 1995, 147, 95.99)
       };

        printBooks(arrayOfBooks);
        String author = getSearchAuthor();
        Book[] resAuthor = search(arrayOfBooks, author);
        printBooks(resAuthor);
        int year = getSearchYear();
        Book[] resYear = searchYear(arrayOfBooks, year);
        printBooks(resYear);
        int percent = getPercentPrice();
        Book[] resPercent = changePrice(arrayOfBooks, percent);
        printBooks(resPercent);
    }


    public static Book addNewBook() {
        /* Method for input each Book using console */
        Book newBook = new Book();
        newBook.setID(1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Input book Name       --> ");
        newBook.setName(sc.next());
        System.out.print("Input book Author     --> ");
        newBook.setAuthor(sc.next());
        System.out.print("Input book publisher  --> ");
        newBook.setPublisher(sc.next());
        System.out.print("Input book year       --> ");
        newBook.setYear(sc.nextInt());
        System.out.print("Input book pages       --> ");
        newBook.setPages(sc.nextInt());
        System.out.print("Input book price       --> ");
        newBook.setPrice(sc.nextDouble());
        return newBook;
    }
    static void printBooks(Book[] array) {
        if (array.length == 0) {
            System.out.println("No elements");
        } else {
            for (Book elem : array) {
                elem.view();
            }
        }

    }
    public static String getSearchAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Author for searching  --> ");
        String searchAuthor = sc.next();
        return searchAuthor;
    }
    public Book[] search(Book[] array, String author) {
        Book[] res = new Book[array.length];
        int counter = 0;
        for (Book elem : array) {
            if (elem.getAuthor().equals(author)) {
                res[counter++] = elem;
            }
        }
        Book[] resReadyForPrint = new Book[counter];
        for (int i = 0; i < counter; i++) {
            resReadyForPrint[i] = res[i];
        }
        return resReadyForPrint;
    }
    public static int getSearchYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Year for searching    --> ");
        int searchYear = sc.nextInt();
        return searchYear;
    }
    public Book[] searchYear(Book[] array, int year) {
        Book[] res = new Book[array.length];
        int counter = 0;
        for (Book elem : array) {
            if (elem.getYear() > year) {
                res[counter++] = elem;
            }
        }
        Book[] resReadyForPrint = new Book[counter];
        for (int i = 0; i < counter; i++) {
            resReadyForPrint[i] = res[i];
        }
        return resReadyForPrint;
    }
    public static int getPercentPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Percent for changing  --> ");
        int percent = sc.nextInt();
        return percent;
    }
    public Book[] changePrice(Book[] array, int percent) {
        Book[] res = new Book[array.length];
        int counter = 0;
        for (Book elem : array) {
            elem.setPrice(Math.round(elem.getPrice() * 100.0)/100.0);
            res[counter++] = elem;
        }
        Book[] resReadyForPrint = new Book[counter];
        for (int i = 0; i < counter; i++) {
            resReadyForPrint[i] = res[i];
        }
        return resReadyForPrint;
    }

}
