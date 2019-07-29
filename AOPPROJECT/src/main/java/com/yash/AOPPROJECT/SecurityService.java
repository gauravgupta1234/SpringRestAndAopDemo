package com.yash.AOPPROJECT;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityService {

	@Pointcut(value="execution(* com.yash.AOPPROJECT.AccountService.*(..))")
	public void method1() {

	}
	@Pointcut(value="execution(* com.yash.AOPPROJECT.AccountService.up*(..))")
	public void method2() {
System.out.println("");
	}
@Before(value="method1()")
	public void verifUser() {
System.out.println(" ");
	}

}
