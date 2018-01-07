package com.javalec.lifecycle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class OtherMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // 생성
		ctx.load("classpath:applicationCTX6.xml"); // 생성
		
		ctx.refresh();
		
		//Student student = ctx.getBean("otherStudent",Student.class); // 사용
		//System.out.println("name : " + student.getName());
		//System.out.println("age : " + student.getAge());
		
		ctx.close(); // 종료

	}	

}
