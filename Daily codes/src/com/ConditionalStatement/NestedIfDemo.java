package com.ConditionalStatement;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =20;
		boolean id=true;
		if(age>=18) {
			if(id) {
				System.out.println("You can vote");
			}
			else {
				System.out.println("Create voter id");
			}
		}
		else {
			System.out.println("Not eligible for voting");
		}
	}

}
