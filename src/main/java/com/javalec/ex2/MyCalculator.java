package com.javalec.ex2;

public class MyCalculator {
	
	Calculator calculator;
	private  int firstNum;
	private int secondNum;
	
	public MyCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void add(){
		calculator.addtition(firstNum, secondNum);
	}
	
	public void sub(){
		calculator.subtraction(firstNum, secondNum);
	}
	
	public void mult(){
		calculator.multplication(firstNum, secondNum);
	}
	
	public void div() {
		calculator.divsion(firstNum, secondNum);
	}
}
