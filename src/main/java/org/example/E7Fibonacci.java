package org.example;

public class E7Fibonacci {
    public static void main(String[] args) {
        /*
        7.	Write a Java Program to print the first 10 numbers of Fibonacci series.
        f = f(n-1) + f(n-2)
         */

        int f = 0, a=1, b=0;
        for (int i = 0; i <=10 ; i++) {
            f = a+b;
            b = a;
            a = f;

                System.out.print(f + " ");

        }
    }
}
