package org.example.in;

public class Pattern {

    public static void main(String[] args) {
    	int rows=6;  
    	for (int i = 1; i <= rows; i++)   
    	{   
    	for (int j = rows; j >= i; j--)  
    	{  
    	System.out.print(j+" ");  
    	}  
    	System.out.println();  
    	} 
    }
}
