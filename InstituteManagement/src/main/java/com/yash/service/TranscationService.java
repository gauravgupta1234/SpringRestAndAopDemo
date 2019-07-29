package com.yash.service;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TranscationService {

	@Pointcut(value = "execution(* com.yash.service.InstituteService.up*(..))")
	public void method1() {

	}

	@Before("method1()")
	public void transactionBegin() {
		System.out.println(" Transcation Service Begin");

	}

	@AfterReturning("method1()")
	public void commit() {
		System.out.println(" Transcation Service Commit");
	}

	@AfterThrowing("method1()")
	public void rollback() {
		System.out.println(" Transcation Service Rollback");
	}

}
