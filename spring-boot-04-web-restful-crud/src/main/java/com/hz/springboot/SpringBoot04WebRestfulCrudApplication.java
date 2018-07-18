package com.hz.springboot;

import com.hz.springboot.component.MyLocaleResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class SpringBoot04WebRestfulCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot04WebRestfulCrudApplication.class, args);
	}

}
