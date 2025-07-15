package com.MultiLvlInheri;
public class Emp extends Person{
	
	private String deptName;
	private long baseSalary;
	
	public Emp(String name, long contactNo, String deptName, long baseSalary) {
		super(name, contactNo);
		this.deptName= deptName;
		this.baseSalary= baseSalary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public long getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(long baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Emp [deptName=" + deptName + ", baseSalary=" + baseSalary + ", toString()=" + super.toString()
				+ "]";
	}
}