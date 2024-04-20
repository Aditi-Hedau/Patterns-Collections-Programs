package org.example.in;

public class Pattern {

    public static void main(String[] args) {
    	int rows=6;  
    	int i, j, k;  
    	for(i=1;i< rows+1 ;i++)  
    	{  
    	for(j=i; j < rows+1 ;j++)  
    	{  
    	System.out.print(j + " ");  
    	}  
    	for(k=1; k < i ;k++)  
    	{  
    	System.out.print(k + " ");  
    	}  
    	System.out.println();  
    	}  
    }
}
