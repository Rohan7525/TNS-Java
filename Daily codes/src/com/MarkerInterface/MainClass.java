package com.MarkerInterface;

public class MainClass {

	public static void main(String[] args) {

		Student s1 = new Student(1,"Rahul","CS",234644.30);
		
		Teacher t1 = new Teacher(2,"Prof.Suresh","OS");
		
		if(s1 instanceof Register) {
			System.out.println("Student is registrable\n"+s1);
			
		}else {
			System.out.println("Student is not registrable");
		}
		
		if(t1 instanceof Register) {
			System.out.println(t1);
			
		}else {
			System.out.println("Teacher is not registrable");
		}
	}

}