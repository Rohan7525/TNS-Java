package com.BreakConti;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 1; i <= 10; i++) {
	            if (i == 5) {
	                System.out.println("Reached 5, breaking the loop.");
	                break;
	            }
	            System.out.println(i);
	        }

	        System.out.println("Loop ended.");
	}

}
