package com.yash.AOPPROJECT;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TranscationService {

	@Pointcut(value="execution(* com.yash.AOPPROJECT.AccountService.my*(..))")
	public void method1() {

	}
	@Pointcut(value="execution(* com.yash.AOPPROJECT.AccountService.up*(..))")
	public void method2() {

	}
    @Before("method1()")
	public void transactionBegin() {
    	System.out.println(" Transcationserrvice Begin");
    	

	}
    @AfterReturning("method1()")
	public void commit() {
    	System.out.println(" Transcationserrvice Commit");
	}

    @AfterThrowing("method1()")
	public void rollback() {
    	System.out.println(" Transcationserrvice Rollback");
	}

}
