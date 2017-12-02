package com.javalec.di4;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1(){
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student student = new Student("김형국",38,hobbys);
		student.setHeight(177);
		student.setWeight(80);
		
		return student;
	}
	
	@Bean
	public Student student2(){
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("독서");
		hobbys.add("음악감상");
		
		Student student = new Student("홍길순",18,hobbys);
		student.setHeight(167);
		student.setWeight(65);
		
		return student;
	}
}
