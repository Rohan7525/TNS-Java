package com.assiThree;
import java.util.*;

public class AssiThree {
	String name;
	
	public AssiThree() {
		System.out.println("Default Constructor");
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	public AssiThree(String name) {
		System.out.println("Parameterised Constructor");
		this.name=name;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name  : ");
		String name = sc.nextLine();
		
		AssiThree obj1= new AssiThree();
		obj1.setName(name);
		
		AssiThree obj2 = new AssiThree(obj1.getName());
		
		System.out.println(obj2.getName());
	}

}