package com.yash.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.yash.dao.InstituteDao;
import com.yash.dao.InstituteDaoImpl;
import com.yash.service.InstituteService;
import com.yash.service.InstituteServiceImpl;
import com.yash.service.LogService;
import com.yash.service.TranscationService;

@Configuration
@EnableAspectJAutoProxy
public class AspectConf {

	@Bean(name = "instituteService")
	public InstituteService instituteService() {
		return new InstituteServiceImpl();
	}

	@Bean(name = "logservice")
	public LogService logService() {
		return new LogService();
	}

	@Bean(name = "transcationService")
	public TranscationService transcationService() {
		return new TranscationService();
	}

	@Bean(name = "instituteDao")
	public InstituteDao instituteDao() {
		return new InstituteDaoImpl();
	}
}
