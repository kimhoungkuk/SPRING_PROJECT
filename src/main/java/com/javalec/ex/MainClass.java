package com.javalec.ex;

public class MainClass {
	public static void main(String[] args) {
		MyCalculation calculation = new MyCalculation();
		calculation.setCalculator(new Calculator());
		
		calculation.setFirstNum(10);
		calculation.setSecondNum(2);
		
		calculation.add();
		calculation.sub();
		calculation.mult();
		calculation.div();
		
	}
}
