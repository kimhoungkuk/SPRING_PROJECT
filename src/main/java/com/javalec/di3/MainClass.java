package com.javalec.di3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX5.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Student student = ctx.getBean("student",Student.class);
		
		ctx.close();
		
		StudentInfo studentinfo = ctx.getBean("studentInfo",StudentInfo.class);
		
		Student student2 = studentinfo.getStudent();
		
		if(student.equals(student2)){
			System.out.println("student1 == student2");
		}
		
		ctx.close();
	}
	
}	
