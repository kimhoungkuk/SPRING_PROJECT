package com.javalec.ex2;

public class Calculator {

	public void addtition(int firstNum , int secondNum){
		System.out.println("addtition()");
		System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
	}
	
	public void subtraction(int firstNum , int secondNum){
		System.out.println("subtraction()");	
		System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
	}
	
	public void multplication(int firstNum , int secondNum){
		System.out.println("multplication()");		
		System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
	}
	
	public void divsion(int firstNum , int secondNum) {
		System.out.println("divsion()");	
		System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
	}
	
}
