package com.Anudip.Program;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		Swapping swapping = new Swapping();
		Greater_Smaller_Asscending_Decending great_small_ass_decending = new Greater_Smaller_Asscending_Decending();
		Scanner sc = new Scanner(System.in);
		
		char again;
		do {
			
			System.out.println("Select the Programe: \n1.Palindrome Number \n2.Find Greater number, Smaller number, Asscending number and Descending number \n3.Swapping number ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				palindrome.palindromeNumber();
				break;
			case 2:
				great_small_ass_decending.select();
				break;
			case 3:
				
				swapping.select();
				break;
				default:
					System.out.println("Invalid Credential");
					break;
			}
			
			
			System.out.println("Want to select Again!! then write yes or no");
			 again = sc.next().charAt(0);
		}while(again == 'y' || again == 'Y');
		
		if(again != 'y' || again != 'Y') {
			System.out.println("<<<<<<<<<<<<<<<<<<<<Bye Bye >>>>>>>>>>>>>>>>>>>>");
			System.out.println("<<<<<<<<<<<<<<<<<<<<Thank you and Visit Again>>>>>>>>>>>>>>>>>>>>");
		}

	}

}
