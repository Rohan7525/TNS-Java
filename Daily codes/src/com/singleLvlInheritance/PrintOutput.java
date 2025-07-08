package com.singleLvlInheritance;

public class PrintOutput{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(24, "Om");
		Citizen c =new Citizen(25, "Rahul", "Indian");
		System.out.println(p);
		System.out.println(c);
	}

}
