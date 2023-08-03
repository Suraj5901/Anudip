package com.anudip_2_Aug;

import java.util.Scanner;

public class MethodOverriding {
	
	
	
	
	
	public static void main(String[] args) {
		
		int choice, num1, num2;
		char again;
		Parent_Class parentClass  = new Parent_Class();
		
		
		Child_Class childClass = new Child_Class();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Enter the Number: \n1.Swaping with using third variable: \n2.Swapping without using third Variable");
			 choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter first Number: ");
				num1 = sc.nextInt();
				System.out.println("Enter Second Number: ");
				num2 = sc.nextInt();
				parentClass.swapping_withVariable(num1, num2);
				break;
			case 2:
				
				System.out.println("Enter first Number: ");
				num1 = sc.nextInt();
				System.out.println("Enter Second Number: ");
				num2 = sc.nextInt();
				childClass.swapping_withVariable(num1, num2);
				break;
				default:
					System.out.println("Invalid Credential!!!!!!!!");
					break;
				
			}
			
			
			System.out.println("Do You Want to try again? type yes or no! ...........");
			again = sc.next().charAt(0);
		}while(again == 'y' || again == 'Y');
		
	}
}
