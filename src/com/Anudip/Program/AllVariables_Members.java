package com.Anudip.Program;

import java.util.Scanner;

public class AllVariables_Members {
	
	
		Scanner sc = new Scanner(System.in);
		int temperary, number1, number2 , choice ;
		
		char select;
		
		
		int  originalNumber, reverse, result;
		
		 
			int size,temp, j, i, greaterNumber;
			
			
			public int[] accept() {
				 
				 System.out.println("Enter the size of Number : ");
				 size = sc.nextInt();
				 
				 int array[] = new int[size];
				System.out.println("Enter "+size+" number ");
				
				for( i = 0; i < array.length; i++) {
					array[i] = sc.nextInt();
				}
				
				System.out.println("Entered Elements are: ");
				for( i = 0; i<array.length; i++) {
					System.out.println(array[i]);			
				}
				 
				 
				 return array;
			 }
	

}
