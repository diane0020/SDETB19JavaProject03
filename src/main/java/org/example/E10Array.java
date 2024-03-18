package org.example;

public class E10Array {
    public static void main(String[] args) {
        /*
        10.	Write a program to print out duplicate elements from an Array of Strings?
         */

        String [] words = {"Iteration", "Strings", "Java","Strings", "Concat", "Syntax", "Java"};

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equals(words[j])){
                    System.out.println("Duplicate: " + words[i]);
                }
            }
        }
    }
}
