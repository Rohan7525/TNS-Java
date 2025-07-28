package com.Abstraction;

public class MainClass {

	public static void main(String[] args) {
		
		Square s= new Square(20.0);
		Rect r= new Rect(10.0,15.0);
		s.calArea();
		s.showArea();
		r.calArea();
		r.showArea();
		
		Shape s1 = new Square(30.0);
		Shape s2 = new Rect(25.0,35.0);
		
		s1.calArea();
		s1.showArea();
		
		s2.calArea();
		s2.showArea();

	}

}