package com.encapsulation;

public class EncapDemo {
	private int serialNo;
	private String name;
	private int age;
	
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "EncapDemo [serialNo=" + serialNo + ", name=" + name + ", age=" + age + "]";
	}
	

}
