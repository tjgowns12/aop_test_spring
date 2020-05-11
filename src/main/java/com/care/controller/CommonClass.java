package com.care.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class CommonClass {
//공통기능을 만듬,나중에만든 프로그램
//공통기능으로 쓸 것을 새로 만듬
	
	public void commonAop(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("====공통기능 시작====");
			joinpoint.proceed();
			//joinpoint 를 만나면 일시중지 되고  해당 코드가 끝나면 다시 시작됨
			System.out.println("====공통기능 종료====");
					
		}catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void beforeAdvice(JoinPoint joinpoint) {
		System.out.println("beforeAdvice()핵심 기능 전에 실행");
	}
}
