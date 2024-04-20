package org.example.in;

public class Pattern {

    public static void main(String[] args) {
        char startChar = 'A'; 
        int rows = 6; 
        
        // upper half
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
           
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print((char) (startChar + i));
                } else {
                    System.out.print(" ");
                }
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
        
        //lower half 
        for (int i = rows - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
           
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print((char) (startChar + i));
                } else {
                    System.out.print(" ");
                }
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
