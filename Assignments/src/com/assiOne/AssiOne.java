package com.assiOne;

public class AssiOne {

	public static void main(String[] args) {
		//even odd
		
		int num1 = 4;
		if(num1 % 2 == 0) {
			System.out.println("Even number.");
		} else {
			System.out.println("Odd number.");
		}
		
		//prime no
		
		int num = 25;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
        
		//vote or not
		
		int age1 = 19;
		if(age1 >= 18) {
			System.out.println("You can vote.");
		} else {
			System.out.println("You cant vote.");
		}
		
		//blood donate
		
		int age2 = 25;
		if((age2 >= 18) && (age2 <= 65)) {
			System.out.println("You can donate blood.");
		}else {
			System.err.println("You cant donate blood.");
		}
	}
}