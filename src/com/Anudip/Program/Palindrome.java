package com.Anudip.Program;

import java.util.Scanner;

public class Palindrome extends Greater_Smaller_Asscending_Decending {
	
	
	
	public void palindromeNumber(){
		System.out.println("Enter the Number: ");
		 number1 = sc.nextInt();
		 originalNumber = number1;
		 reverse = 0;
		 result=0;
		while(number1>0) {
			
			//for example input is 121
			result = number1%10;// 1
			reverse = reverse*10+result;//1
			number1 = number1/10;//12
			
			
		}
		System.out.println(reverse);
		
		if(originalNumber == reverse) {
			System.out.println("It is palindrome number: ");
			
		}else {
			System.out.println("it is not palindrome number: ");
		}
	}
	
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.palindromeNumber();
	}

}
