package com.care.controller;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
//aop=관점지향 프로그래밍(내가 원하는 시점에서 데이터를 주입한다)
	public static void main(String[] args) {
		String path="classpath:applicationAOP_01.xml";
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext(path);
		CoreClass tc=ctx.getBean("core",CoreClass.class);
		
		System.out.println("main start!!!!");
		tc.corePrint();
		System.out.println("main end!!!!");
		ctx.close();
	}
	
}
