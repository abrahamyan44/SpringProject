package com.springProject.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.springProject.services.MySqlApp․EmpDao","com.springProject.services.MySqlApp․Emp","com.springProject.services.MySqlApp․EmpController"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	}

