package com.SingleLvlInheritance;

public class Student extends Citizen {

	private int rollNo;
	private String clgName;
	
	public Student() {
		super();
	}

	public Student(String name, long aadharno, String address, long phno, int rollNo, String clgName) {
		super(name, aadharno, address, phno);
		
		this.rollNo= rollNo;
		this.clgName= clgName;
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return clgName;
	}

	public void setCollegeName(String clgName) {
		this.clgName = clgName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + clgName + ", Name=" + getName()
				+ ", Aadharno=" + getAadharno() + ", Address=" + getAddress() + ", Phno=" + getPhno()
				+"]";
	}
	
}