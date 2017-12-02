package com.javalec.di4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student = ctx.getBean("student1",Student.class);
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		System.out.println("취미 : " + student.getHobbys());
		System.out.println("키 : " + student.getHeight());
		System.out.println("몸무게 : " + student.getWeight());

		ctx.close();
		
		Student student2 = ctx.getBean("student2",Student.class);
		
		System.out.println("이름 : " + student2.getName());
		System.out.println("나이 : " + student2.getAge());
		System.out.println("취미 : " + student2.getHobbys());
		System.out.println("키 : " + student2.getHeight());
		System.out.println("몸무게 : " + student2.getWeight());

		ctx.close();
	}
	
}	
