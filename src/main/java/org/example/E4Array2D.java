package org.example;

public class E4Array2D {
    public static void main(String[] args) {
        /*
        4.	Create a 2D array of integers. Develop a program which
        will calculate the sum of even and odd numbers for that array.
         */

        int [][] num = {
                {10, 23, 40, 51},
                {22, 40, 90, 65},
                {15, 57, 32, 30}
        };

        int sumEven = 0;
        int sumOdd = 0;
        for (int[] n : num) {
            for (int i : n) {
                if ((i%2) == 0) {
                    sumEven += i;
                } else {
                    sumOdd += i;
                }

            }
        }

        System.out.println("Sum of Even: " + sumEven);
        System.out.println("Sum of Odd: " + sumOdd);
    }
}
