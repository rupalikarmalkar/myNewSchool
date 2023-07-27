package com.prc.myNewSchool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MyNewSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyNewSchoolApplication.class, args);
	}

}
