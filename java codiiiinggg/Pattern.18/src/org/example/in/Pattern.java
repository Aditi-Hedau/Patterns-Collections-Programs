package org.example.in;

public class Pattern {

    public static void main(String[] args) {
    	int i, j;
    	int rows = 7;  
        
    	for (i = rows; i >= 1; i--)  
    	{  
    	for (j = rows; j >= i; j--)  
    	{  
    	System.out.print(j+" ");  
    	}  
    	   
    	System.out.println();  
    	}  
    }
}
