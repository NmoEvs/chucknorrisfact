package com.chezouam.chucknorrisfact;

import com.chezouam.chucknorrisfact.controller.FactController;
import com.chezouam.chucknorrisfact.service.FactService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:AppConfiguration.xml")
public class ChucknorrisfactApplication {

	public static void main(String[] args) {

		 ApplicationContext ctx = SpringApplication.run(ChucknorrisfactApplication.class, args);
		 FactService service = ctx.getBean(FactService.class);
		 service.getRandomJoke();
	}
}
