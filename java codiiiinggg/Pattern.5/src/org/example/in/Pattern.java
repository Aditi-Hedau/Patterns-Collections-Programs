package org.example.in;

public class Pattern {

    public static void main(String[] args) {
        int rows = 7;
        
        //UPPER TRIANGLE
        for (int i = 1; i <= rows / 2 + 1; i++) {
            for (int j = 1; j <= rows / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            for(int j = i ; j >= 1; j--) {
            	System.out.print(j);
            }
            for(int j = 2; j <= i; j++) {
            	System.out.print(j);
            }
            System.out.println();         
        }
 
        //LOWER TRIANGLE
        for (int i = rows / 2; i >= 1; i--) {
            for (int j = 1; j <= rows / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            for(int j = i ; j >= 1; j--) {
            	System.out.print(j);
            }
            for(int j = 2; j <= i; j++) {
            	System.out.print(j);
            }
            System.out.println();         
        }
    }
    
}

