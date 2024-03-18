package org.example;

public class E3Array2D {
    public static void main(String[] args) {
        /*
        3.	Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */

        int [][] num = {
                {10, 20, 40, 50},
                {22, 40, 90, 65},
                {15, 50, 32, 30}
        };

        for (int[] n : num) {
            for (int i : n) {
                if ((i%2) == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
