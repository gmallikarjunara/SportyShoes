package com.simplilearn.phase3.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	
	private final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private final String USE = "system";
	private final String PWD = "orcl";
	private final String DRI = "oracle.jdbc.driver.OracleDriver";
	
	//String url = "jdbc:oracle:thin:@localhost:1521:orcl",user = "system", pwd = "orcl";
	//oracle.jdbc.driver.OracleDriver
	
	@Bean
	DataSource datasource() {
		DriverManagerDataSource dms = new DriverManagerDataSource();
		dms.setUrl(URL);
		dms.setUsername(USE);
		dms.setDriverClassName(DRI);
		dms.setPassword(PWD);
		return dms;
	}

}
