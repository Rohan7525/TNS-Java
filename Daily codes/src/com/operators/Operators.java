package com.operators;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic operators
		System.out.println("Addition : 10 + 20 : "+(10+20));
		System.out.println("Subtraction : 10 - 20 : "+(10-20));

		//Assignment operators
		int num1 = 10;
		System.out.println(num1 += 2);
		System.out.println(num1 -= 2);
		
		//Logical operators
		System.out.println(1 & 1);
		System.out.println(1 | 0);
		
		//Relational operators
		int num2 = 21, num3 = 51;
		
		System.out.println(num2 < num3);
		System.out.println(num2 > num3);
		System.out.println(num2 >= num3);
		System.out.println(num2 >= num3);

		//Ternary operators
		int x = 50, y = 30;
		
		int max = (x < y)? y : x ;
		
		System.out.println(max);

		//Unary operators
		 int a = 5;
		 
		 System.out.println(a++);
		 System.out.println(a--);
	}

}
