package com.MultiLvlInheri;
public class LvlOneEmp extends Emp{

	private int noofShares; 
	private String authority;
	
	public LvlOneEmp(String name, long contactNo, String deptName, long baseSalary, int noofShares,String authority ) {
		super(name, contactNo, deptName, baseSalary);
		
		this.noofShares= noofShares;
		this.authority= authority;
	}

	public int getNoofShares() {
		return noofShares;
	}

	public void setNoofShares(int noofShares) {
		this.noofShares = noofShares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "LvlOneEmp [noofShares=" + noofShares + ", authority=" + authority + ", toString()="
				+ super.toString() + "]";
	}
}