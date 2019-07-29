package com.yash.AOPPROJECT;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LogService {

	@Pointcut(value = "execution(* com.yash.AOPPROJECT.AccountService.*(..))")
	public void method1() {


				
	}
	@Pointcut(value = "execution(* com.yash.AOPPROJECT.CustomerService.up*(..))")
	public void method2() {

	}

	@Before("method1() or method2()")
	public void logBefore() {

		System.out.println(" logservice logBefore()");
	}

	@AfterReturning("method1()")
	public void logReturning() {
		System.out.println(" logservice logReturning()");
	}

	@AfterThrowing("method1()")
	public void logThrowing() {
		System.out.println(" logservice logThrowing()");
	}
	

	@After("method1()")
	public void logAfter() {
		System.out.println(" logservice logAfter()");
	}
	

}
