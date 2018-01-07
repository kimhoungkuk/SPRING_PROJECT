package com.javalec.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy; 

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class OtherStudent {
	
	private String name;
	private int age;
	
	public OtherStudent(String name, int age){
		this.name = name;
		this.age = age;
	}
 
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@PostConstruct
	public void initMethod(){
		System.out.println("initMethod");
	}
	
	@PreDestroy
	public void destoryMethod(){
		System.out.println("initMethod");
	}
}
