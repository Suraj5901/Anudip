package com.Anudip.Program;

import java.util.Scanner;

public class Greater_Smaller_Asscending_Decending extends AllVariables_Members {
	
	 
	 
	 
	
	
	    void greater() {
		
		int array[] = accept();
		 greaterNumber = array[0] ;
		for( i =0; i<array.length; i++) {
			if(greaterNumber < array[i]) {
				greaterNumber = array[i];
			}
		}
		System.out.println("The greater no is = "+greaterNumber);
	
		
		
	}
	
	
	void smaller() {
		
		int array[] = accept();
		 greaterNumber = array[0] ;
			for( i =0; i<array.length; i++) {
				if(greaterNumber > array[i]) {
					greaterNumber = array[i];
				}
			}
			System.out.println("The Smaller no is = "+greaterNumber);
			
		}
		
	
	void asscending() {
		
		
		int array[] = accept();
		
		int temp;
		for(i=0; i<array.length; i++) {
			for(j = i+1; j<array.length; j++) {
				if(array[i]> array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			System.out.println("Ascending number are: ");
			for(i=0; i<array.length; i++) {
				System.out.println(array[i]);
			}
		}
		
		
		
		
	}
	
	
	void decending() {
		
		
		int array[] = accept();
		
		 temp = 0;
		for(i=0; i<array.length; i++) {
			for(j = i+1; j<array.length; j++) {
				if(array[i]< array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			System.out.println("Descending number are: ");
			for(i=0; i<array.length; i++) {
				System.out.println(array[i]);
			}
		}
		
		
	}

	public void select() {
			
			
		do {
			
			
System.out.println("Select the number: \n1.To find Greater Number \n2.To find Smaller Number \n3.To find Asscending Number \n4.To find Desscending Number");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				greater();
				break;
			case 2:
				 smaller();
				break;
			case 3:
				asscending();
				break;
			case 4:
				decending();
				break;
				default:
					System.out.println("Invalid Credential");
					break;
			
			}
			
			System.out.println("Want to select again? \n Write 'yes' or 'no'");
			select = sc.next().charAt(0);
		}while(select == 'y' || select == 'Y');
		
	}

}
