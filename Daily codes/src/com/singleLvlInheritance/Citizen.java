package com.singleLvlInheritance;

public class Citizen extends Person{
	private String nationality;

	public Citizen() {
		super();
	}

	public Citizen(int age, String name, String nationality) {
		super(age, name);
		this.nationality = nationality;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Citizen [nationality=" + nationality + ", toString()=" + super.toString() + "]";
	}
	
}
