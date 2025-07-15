package com.accessModifier;

public class AccModifier {
	
	int num1= 10;
	public int num2=20;
	private int num3=30;
	private int num4=40;
	
	void methodDefault()
	{
		System.out.println("Default Access Modifier");
		System.out.println("Default Variable"+ num1);
	}
	
	public void methodPublic()
	{
		System.out.println("Public Access Modifier");
		System.out.println("Public Variable"+ num2);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private Access Modifier");
		System.out.println("Private Variable"+ num3);
	}
	
    protected void methodProtected()
	{
		System.out.println("Protected Access Modifier");
		System.out.println("Protected Variable"+ getVarProtected());
	}

	public int getVarProtected() {
		return num4;
	}

	public void setVarProtected(int num4) {
		this.num4 = num4;
	}
}