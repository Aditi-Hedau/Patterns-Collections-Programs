package org.example.in;

public class Pattern {

    public static void main(String[] args) {
        int rows = 5;
        int count = 1;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }

            System.out.println(); // Print a newline after each row
        }
 
    }

}
