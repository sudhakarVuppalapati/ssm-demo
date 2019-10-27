package com.example.ssm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsmDemoApplication implements CommandLineRunner  {
	
	
	
	
	
	
	@Autowired
	TestParameter testParameter;

	public static void main(String[] args) {
		SpringApplication.run(SsmDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		System.out.println("testParameter  : "+testParameter.getSomeParamName());
	}

}
