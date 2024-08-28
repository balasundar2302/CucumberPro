package com.pojo;

public class Pojo1 {
	
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	private int mtd1() {
		return a;
	}
	
	public static void main(String[] args) {
		Pojo1 p1= new Pojo1();
		System.out.println(p1.getA());
		
		p1.setA(10);
		System.out.println(p1.getA());
		p1.setA(20);
		
		System.out.println(p1.getA());
		System.out.println(p1.mtd1());
		
//		int z=10;
//		z=100;
//		System.out.println(z);
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public int getA() {
//		return a;
//	}
//
//	public void setA(int a) {
//		this.a = a;
//	}
//	private int hai() {
//		// TODO Auto-generated method stub
//		return a;
//	}
//
//	private int a;
//
//	public static void main(String[] args) {
//		Pojo1 a=new Pojo1();
//		System.out.println(a.getA());
//		a.setA(10);
//		System.out.println(a.getA());
//		System.out.println(a.hai());
//	}



