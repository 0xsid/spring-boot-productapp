package com.deloitte.deloittespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deloitte.deloittespringboot.controller.HelloController;

@SpringBootApplication
public class DeloitteSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeloitteSpringBootApplication.class, args);
//		HelloController hc = new HelloController();
//		hc.sayHello(m);
	}

}
