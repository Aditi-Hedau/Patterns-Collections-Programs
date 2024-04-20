package org.example.in;

public class Pattern {

    public static void main(String[] args) {
        int rows = 5;

        // Upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print increasing sequence
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print decreasing sequence
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
