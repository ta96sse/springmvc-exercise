package com.springmvc.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@ComponentScan
@SpringBootApplication
@Configuration
public class SpringmvcExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcExerciseApplication.class, args);
	}

	// メッセージファイル登録
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

}
