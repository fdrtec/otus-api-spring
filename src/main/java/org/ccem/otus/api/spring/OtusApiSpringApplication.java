package org.ccem.otus.api.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OtusApiSpringApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OtusApiSpringApplication.class, args);
	}

	@Override
	protected  SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(getClass());
	}

}
