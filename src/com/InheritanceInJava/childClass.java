package com.InheritanceInJava;

public class childClass extends BaseClass {
	
	public void mul() {
		System.out.println("multiplication is 250");
	}
	
	public void div() {
		System.out.println("Division is 100");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClass obj1 = new childClass();
		obj1.add();
		obj1.subs();
		obj1.mul();
		obj1.div();
		
		System.out.println("=================");
		
		BaseClass obj2 = new BaseClass();
		obj2.add();
		obj2.subs();
		System.out.println("=================");

	}

}
