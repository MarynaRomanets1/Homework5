package com.epam.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int size = getSizeArray();
        Books shelf = new Books(size);

    }

    public static int getSizeArray() {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        while (true) {
            System.out.println("Input size of array from 10 to 50 --> ");
            size = sc.nextInt();
            if ((size > 9) && (size < 51)) {
                return size;
            }
            System.out.println("Invalid size. Repeat, please");
        }
    }
}
