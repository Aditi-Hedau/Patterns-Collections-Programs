package org.example.in;

public class Pattern {

    public static void main(String[] args) {
        char startChar = 'A'; 
        

        for (char c = 'A'; c <= 'F'; c++) {
            for (char i = 'A'; i <= c; i++) {
                System.out.print(c + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
