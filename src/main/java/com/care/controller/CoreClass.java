package com.care.controller;

public class CoreClass {
//로그인 하는 코드를 만드는데 Class
	public void corePrint() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(100);
				System.out.println("핵심 기능 실행!!!(이미 만든 프로그램)");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
