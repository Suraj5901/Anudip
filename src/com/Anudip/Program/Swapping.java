package com.Anudip.Program;

import java.util.Scanner;

public class Swapping extends AllVariables_Members{
	
	
	
	void with_Using_Third_Variable() {
		System.out.println("Enter the first number: ");
		number1 = sc.nextInt();
		System.out.println("Before Swapping the first number: " + number1);
		
		System.out.println("Enter the Second number: ");
		number2 = sc.nextInt();
		System.out.println("Before Swapping the Second number: " + number2);
		
		temperary = number2;
		number2 = number1;
		number1 = temperary;
		
		System.out.println("After Swapping the first number: " + number1);
		System.out.println("After Swapping the Second number: " + number2);
		
	}
	
	
	
    void without_Using_Third_Variable() {
    	
    	
    	System.out.println("Enter the first number: ");
		number1 = sc.nextInt();
		System.out.println("Before Swapping the first number: " + number1);
		
		System.out.println("Enter the Second number: ");
		number2 = sc.nextInt();
		System.out.println("Before Swapping the Second number: " + number2);
		
		number1 = number1*number2;
		number2 = number1/number2;
		number1 = number1/number2;
		
		System.out.println("After Swapping the first number: " + number1);
		System.out.println("After Swapping the Second number: " + number2);
		
	}
    
    
	
	public void select() {
		
		System.out.println("Select the number: \n1.With Using Third Variable \n2.Without Using Third Variable");
		
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			 with_Using_Third_Variable();
			break;
		case 2:
			 without_Using_Third_Variable();
			break;
			default:
				System.out.println("Invalid Credential");
				break;
		
		}
		
	}

}
