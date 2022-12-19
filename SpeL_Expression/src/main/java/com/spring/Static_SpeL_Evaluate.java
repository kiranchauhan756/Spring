package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Static_SpeL_Evaluate {
	@Value("#{T(java.lang.Math).PI}")
	private double PI;

	@Override
	public String toString() {
		return "Static_SpeL_Evaluate [PI=" + PI + ", x=" + x + ", sqrt=" + sqrt + "]";
	}

	@Value("#{22+33+67}")
	private int x;

	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int sqrt;

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getSqrt() {
		return sqrt;
	}

	public void setSqrt(int sqrt) {
		this.sqrt = sqrt;
	}

}
