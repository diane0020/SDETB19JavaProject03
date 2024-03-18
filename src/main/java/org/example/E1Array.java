package org.example;

public class E1Array {
    public static void main(String[] args) {
        /*
        1.	Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week
         */

        double [] temp = {36.2, 35.4, 20.5, 39, 32.01, 31.2, 30};

        double max = temp[0];
        double min = temp[0];

        for (double t : temp) {
            if (max < t) {
                max = t;
            } else if (min > t) {
                min = t;
            }
        }

        System.out.println("Highest Temperature for the week: " + max);
        System.out.println("Lowest Temperature for the week: " + min);
    }
}
