package org.example.in;

public class Pattern {

    public static void main(String[] args) {
    	int rows=7;  
    	
    	int i, j;         
    	for (i = 1; i <= rows; i++)   
    	{  
    	for (j = 1; j <= i; j++)  
    	{  
    	if(j%2 == 0)  
    	{  
    	System.out.print(0);  
    	}  
    	else  
    	{  
    	System.out.print(1);  
    	}  
    	}  
    	System.out.println();  
    	}  
    }
}
