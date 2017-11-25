package com.javalec.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		MyCalculation calculation = new MyCalculation();
//		calculation.setCalculator(new Calculator());
//		
//		calculation.setFirstNum(10);
//		calculation.setSecondNum(2);
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mult();
		myCalculator.div();
		
	}
}
