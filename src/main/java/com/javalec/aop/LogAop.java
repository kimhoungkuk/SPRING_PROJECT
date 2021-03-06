package com.javalec.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	/*
	 * 	<aop:before> : 메소드 실행 전에 advice 실행
	 *  <aop:after-returning> : 정상적으로 메소드 실행 후에 advice 실행
	 *  <aop:after-throwing> : 메소드 실행중 exception 발생시 advice 실행
 	 *  <aop:after> :메소드 실행중 execption 이 발생하여도 advice 실행
	 *  <aop:around> : 메서드 실행 전/후 및 exception 발생시 advice 실행
	 */
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println( signatureStr + " is start");
		long st = System.currentTimeMillis();
		
		try{
			Object obj = joinpoint.proceed();
			return obj;
		}finally{
			long et = System.currentTimeMillis();
			
			System.out.println( signatureStr + " is finished");
			System.out.println( signatureStr + " 경과시간 " + (et - st));
		}
	}
}
