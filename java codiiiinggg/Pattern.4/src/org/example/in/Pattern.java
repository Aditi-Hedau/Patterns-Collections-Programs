package org.example.in;

public class Pattern {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }
            int num = 1;
            for(int j = 0; j <= i; j++) {
            	System.out.printf("%4d" , num);
            	num = num * (i - j) / (j + 1);
            }
            System.out.println(); // Print a newline after each row
        }
 
    }

}
