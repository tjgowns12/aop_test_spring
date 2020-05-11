package com.care.aop_02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
//Aspect는 공통기능으로 쓰겠다
public class CommonClass {
//공통기능을 만듬,나중에만든 프로그램
//공통기능으로 쓸 것을 새로 만듬
	@Around("within(com.care.aop_02.*)")
	//시작 전과 후로 동작함
	//해당하는 모든 메소들중 하나라도 후출이 되면 실행전과 후로 실행시키게 한다.
	public void commonAop(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("====공통기능 시작====");
			joinpoint.proceed(); 
			//joinpoint 를 만나면 일시중지 되고  CoreClass에 있는 메소드가 끝나면 다시 시작됨
			System.out.println("====공통기능 종료====");
					
		}catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Before("execution(* com.care.aop_02.CoreClass.test())")
	//test메소드 전에 실행시킴
	public void beforeAdvice(JoinPoint joinpoint) {
		System.out.println("beforeAdvice()핵심 기능 전에 실행");
	}
}
