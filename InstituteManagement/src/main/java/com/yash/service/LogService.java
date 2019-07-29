package com.yash.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogService {

	
	@Pointcut(value = "execution(* com.yash.service.InstituteService.*(..))")
	public void instituteServices() {

	}

	@Before("instituteServices()")
	public void logBefore() {

		System.out.println(" logservice logBefore()");
	}

	@AfterReturning("instituteServices()")
	public void logReturning() {
		System.out.println(" logservice logReturning()...............................");
	}

	@AfterThrowing(value = "execution(* com.yash.service.InstituteService.del*(..))")
	public void logThrowing() {
		System.out.println(" logservice logThrowing()");
	}

	@After("instituteServices()")
	public void logAfter() {
		System.out.println(" logservice logAfter()");
	}

}
