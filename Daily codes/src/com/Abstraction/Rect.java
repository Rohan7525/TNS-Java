package com.Abstraction;

public class Rect extends Shape {
	
	private double w,l;
	public Rect(double w, double l) {
		this.w = w;
		this.l = l;
	}

	@Override
	void calArea() {
		area = w*l;
		
	}

	@Override
	void showArea() {
		System.out.println("Area of Rectangle : "+area);
		
	}

}