package com.Scanner;
import java.util.Scanner;
public class DemoScanner {
	public  void addNum(int n1,int n2) {
		System.out.println(n1+n2);
	}
	
	public void subNum() {
		System.out.println(10*30);
	}
	public static void main(String[] args) {
		
		
		Scanner input =new Scanner(System.in);
		int n1 =input.nextInt();
		int n2 =input.nextInt();
		DemoScanner obj= new DemoScanner();
		obj.addNum(n1,n2);
		obj.subNum();
		input.close();

	}
}