package com.spring;

public class Addition {
	private int a;
	private int b;

	Addition(int a, int b) {
		System.out.println("int ,,, int");
		this.a = a;
		this.b = b;

	}

	Addition(double a, double b) {
		System.out.println("double,,,, double");
		this.a = (int) a;
		this.b = (int) b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	Addition(String a, String b) {
		System.out.println("string    ,,,, string");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	public void doSum() {
		System.out.println("sum=" + (this.a + this.b));
	}
}
