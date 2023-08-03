package com.anudip_2_Aug;

public class Child_Class extends Parent_Class {
	
	@Override
	public void swapping_withVariable(int num1, int num2) {
		// TODO Auto-generated method stub
		num1 = num1 + num2;
		num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Child class: After swapping without third variable - Number1: " + num1 + ", Number2: " + num2);
	}

}
