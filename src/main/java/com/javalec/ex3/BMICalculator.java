package com.javalec.ex3;

public class BMICalculator {
	private double lowHeight;
	private double normal;
	private double overWeight;
	private double obesity;
	
	public void bmicalculator(double weight, double height){
		double h = height * 0.01;
		double result = weight / (h*h);
		
		System.out.println("BMI 지수 : " + (int)result);
		
		if(result > obesity){
			System.out.println("비만입니다.");
		}else if(result > overWeight){
			System.out.println("과체중입니다.");
		}else if(result > normal){
			System.out.println("정상입니다.");
		}else {
			System.out.println("저체중입니다.");
		}
	}

	public double getLowHeight() {
		return lowHeight;
	}

	public void setLowHeight(double lowHeight) {
		this.lowHeight = lowHeight;
	}

	public double getNormal() {
		return normal;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public double getOverWeight() {
		return overWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
}
