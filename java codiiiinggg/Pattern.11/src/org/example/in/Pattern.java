package org.example.in;

public class Pattern {

    public static void main(String[] args) {
    	   
    	int i, j, rows=7;  
    	//Prints upper half  pattern  
    	for (i = rows; i >= 1; i--)   
    	{  
    	for (j = 1; j <= i; j++)  
    	{  
    	System.out.print(j+" ");  
    	}  
    	System.out.println();  
    	}  
    	//Prints lower half  pattern  
    	for (i = 2; i <= rows; i++)   
    	{  
    	for (j = 1; j <= i; j++)  
    	{  
    	System.out.print(j+" ");  
    	}  
    	System.out.println();  
    	}  
    	}  
}

