package org.example.in;

public class Pattern {

    public static void main(String[] args) {
        int rows = 5;
       
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.printf("%d ", j);
            }
            System.out.println(); // Print a newline after each row
        }
        }
 
    }

