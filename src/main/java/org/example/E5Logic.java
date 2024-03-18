package org.example;

public class E5Logic {
    public static void main(String[] args) {
        /*
        5.	Write a program to swap 2 numbers without a temporary variable?
         */

        int a = 4;
        int b = 5;

        System.out.println("Before: A = " + a + " B = " + b );

        a += b;
        b = a - b;
        a = a - b;

        System.out.println("After: A = " + a + " B = " + b);
    }
}
