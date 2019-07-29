package com.yash.AOPPROJECT;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfiguration.class);
		AccountService service = (AccountService) ctx.getBean("accountService");
		//service.getBalance();
		service.myDeposite();
		//service.myWithdraw();
	}
}
