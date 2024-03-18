package org.example;

public class E8Array {
    public static void main(String[] args) {
        /*
        8.	Maximum and minimum number in the array?
         */

        int [] num = {3, 35, 20, 39, 32, 31, 30, 45,7,9};

        int max = num[0];
        int min = num[0];

        for (int n : num) {
            if (max < n) {
                max = n;

            } else if (min > n) {
                min = n;
            }
        }

        System.out.println("Maximum number in array is " + max);
        System.out.println("Minimum number in array is " + min);
    }
}
