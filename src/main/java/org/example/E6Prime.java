package org.example;

import java.util.Scanner;

public class E6Prime {
    public static void main(String[] args) {
        /*
        6.	Write a java program to check whether a given number is prime or not?
        prime formula that is not 1, 2, 3: 6n+1 == n
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        int num = scan.nextInt();

        if (num != 1 && num != 2 && num != 3) {
            if ((num%6) == 1){
                int result = 0;
                result = num /6;

                if (num == (6*result +1)){
                    System.out.println("Number " + num + " is prime number");
                } else {
                    System.out.println("Number " + num + " is not prime number");
                }
            } else {
                System.out.println("Number " + num + " is not prime number");
            }
        } else {
            System.out.println("Number " + num + " is a prime number");
        }

    }
}
