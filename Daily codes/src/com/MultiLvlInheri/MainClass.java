package com.MultiLvlInheri;

public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person("Kamlesh", 9876543321L);
		System.out.println(p1);
		
		p1 = new Emp("Abhi", 9087921234L,"Sales", 67890);
		System.out.println(p1);
		
		p1= new LvlOneEmp("Om",8976543219L,"IT",100000,100,"Signning Authority");
	}
}