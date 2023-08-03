package com.anudip_2Aug;

import java.util.Scanner;

public class ExampleMethodOverloading {
	
	static  int num1, num2, num3, value, size,i,j,greaterNumber, array;
	static  Scanner sc = new Scanner(System.in);
	
	
	

		
		
		 
	
	
	
	
	
	void findGreaterNo( int num1, int num2) {
		
		System.out.println("Enter Number1: ");
		num1 = sc.nextInt(); 
		
		System.out.println("Enter Number2: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" Number1 is greater than Number2");
		}else if(num2>num1) {
			System.out.println(num2+" Number2 is greater than Number1");
		}else {
			System.out.println("Both are equal");
		}
		
	}
	
	
	void findGreaterNo( int num1, int num2, int num3) {
			
			System.out.println("Enter Number1: ");
			num1 = sc.nextInt(); 
			
			System.out.println("Enter Number2: ");
			num2 = sc.nextInt();
			
			System.out.println("Enter Number3: ");
			num3 = sc.nextInt();
			
			if(num1>num2 || num1>num3) {
				System.out.println(num1+" Number1 is greater than Number2 and Number3");
			}else if(num2>num1 || num2>num3) {
				System.out.println(num2+" Number2 is greater than Number1 and Number3");
			}else if(num3>num1 || num2<num3) {
				System.out.println(num3+" Number3 is greater than Number1 and Number2");
			}else {
				System.out.println("Invalid Number");
			}
			
		}
	
	void findGreaterNo(int number[]) {
		
		
		
		 greaterNumber = number[0] ;
		for( i =0; i<number.length; i++) {
			if(greaterNumber < number[i]) {
				greaterNumber = number[i];
			}
		}
		System.out.println("The greater no is = "+greaterNumber);
		
		}

	public static void main(String[] args) {
		

		ExampleMethodOverloading md = new ExampleMethodOverloading();
		
		System.out.println("Enter the Number: \n1.find Greater between 2 no \n2.Find greater no between arrays: \n3.find Greater between 3 no: ");
		value = sc.nextInt();
		switch(value) {
		case 1:
			md.findGreaterNo(num1, num2);
			break;
		case 2:
			
			System.out.println("Enter the size of Number : ");
			 size = sc.nextInt();
			 
			 int array[] = new int[size];
			System.out.println("Enter "+size+" number ");
			
			for( i = 0; i < size; i++) {
				 array[i] = sc.nextInt();
				
			}
			md.findGreaterNo(array);
			break;
			
		case 3:
			md.findGreaterNo(num1, num2, num3);
			break;
			default:
				break;
		}
		 
		

	}

}
