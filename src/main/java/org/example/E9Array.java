package org.example;

public class E9Array {
    public static void main(String[] args) {
        /*
        9.	Write a java program to find the second largest number in the array?
         */

        int [] num = {3, 35, 20, 39, 32, 31, 30, 45,7,9};

        int max = num[0];
        int second = num[0];

        for (int n : num) {
            if (max < n) {
                second = max;
                max = n;

            } else if (second < n) {
                second = n;

            }

        }
        System.out.println("Second Largest number in the array is " + second);
    }
}
