package springboot.config;

import org.springframework.boot.SpringApplication;

import springboot.controller.HelloWorldController;

public class Application {
	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(HelloWorldController.class, args);
	    }
}
