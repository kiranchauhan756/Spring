package com.spring;



public class Salary {
	private int pf;
	private int ctc;

	
	public Salary(int pf, int ctc) {
		super();
		this.pf = pf;
		this.ctc = ctc;
	}

	@Override
	public String toString() {
		return " [pf=" + pf + ", ctc=" + ctc + "]";
	}

}
