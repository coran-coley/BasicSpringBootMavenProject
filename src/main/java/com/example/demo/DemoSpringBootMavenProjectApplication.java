package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//ComponentScan is required to prevent a Whitelabel 404 Error by pointing the Component Scan to a more general package.
//The other way to fix this is to move your Controller to the same folder as the this main class (I don't recommend it)
@ComponentScan(basePackages = "com.example")
public class DemoSpringBootMavenProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootMavenProjectApplication.class, args);
	}
	
	 @Bean
	    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	        return args -> {

	            System.out.println("Let's inspect the beans provided by Spring Boot:");

	            String[] beanNames = ctx.getBeanDefinitionNames();
	            Arrays.sort(beanNames);
	            for (String beanName : beanNames) {
	                System.out.println(beanName);
	            }

	        };
	    }

}
