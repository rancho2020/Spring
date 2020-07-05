package com.rest.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@Import({DaoConfig.class,WebConfig.class,ServiceConfig.class})
public class AppConfig {

	public AppConfig() {
		super();
	}



}
