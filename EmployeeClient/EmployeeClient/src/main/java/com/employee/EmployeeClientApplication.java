package com.employee;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.client.RestClientException;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class EmployeeClientApplication {

	
	
	public static void main(String[] args) throws RestClientException, IOException {
		SpringApplication.run(EmployeeClientApplication.class, args);
		
		TestControllerClient testControllerClient=new TestControllerClient();
		testControllerClient.getEmployee();
	}


}
