package com.yash.AOPPROJECT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfiguration {

	@Bean(name="accountService")
	public AccountService accountService() {
		return new AccountService();
	}

	@Bean(name="logservice")
	public LogService logService() {
		return new LogService();
	}

	@Bean(name="securityService")
	public SecurityService securityService() {
		return new SecurityService();
	}

	@Bean(name="transcationService")
	public TranscationService transcationService() {
		return new TranscationService();
	}
	
	@Bean(name="Customerservice")
	public CustomerService customerService() {
		return new CustomerServiceImpl();
	}

}
