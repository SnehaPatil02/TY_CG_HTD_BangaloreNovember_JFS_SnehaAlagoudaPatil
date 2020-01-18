package com.capgemini.module2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.stereotype.Controller;

@Controller
public class ORMConfig {

	@Bean
	public LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("module2-unit");
		return bean;
	}
}
