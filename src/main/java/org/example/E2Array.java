package org.example;

public class E2Array {
    public static void main(String[] args) {
        /*
        2.	Create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array.
         */

        int [] num = {36, 35, 20, 39, 32, 31, 30};

        int sum = 0;

        for (int n : num) {
            sum += n;
        }

        System.out.println("Sum of all numbers in the array: " + sum);
    }
}
