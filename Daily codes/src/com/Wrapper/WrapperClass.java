package com.Wrapper;
import java.lang.*;
public class WrapperClass {
	
	public static void main(String args[]) {
		
		int x=25;
		Integer myint = x;
		Integer newint = 500;
		int y = newint.intValue();
		System.out.println(y);
		System.out.println(myint.BYTES);
	}

}