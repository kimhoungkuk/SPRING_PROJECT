package com.javalec.ex3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation); // 스프링 컨테이너 생성
		Myinfo myinfo = ctx.getBean("myInfo",Myinfo.class); // 스프링 컨테이너에서 컴포넌트 가져옴
		myinfo.getInfo(); 
		ctx.close();     
		
	}
}
