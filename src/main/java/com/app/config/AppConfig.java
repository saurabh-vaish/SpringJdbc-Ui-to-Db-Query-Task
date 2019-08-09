package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.app")
@PropertySource("classpath:app.properties")
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public DriverManagerDataSource dsobj()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("dcn"));
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("un"));
		ds.setPassword(env.getProperty("pwd"));
		return ds;
	}
	
	@Bean
	public JdbcTemplate jtobj()
	{
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(dsobj());
		return jt;
	}
	
	
	@Bean
	public InternalResourceViewResolver ivr()
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setSuffix(env.getProperty("suffix"));
		vr.setPrefix(env.getProperty("prefix"));
		return vr;
	}
	
	
}
