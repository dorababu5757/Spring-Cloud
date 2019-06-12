package com.employee;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableFeignClients
public class EmployeeClientApplication {
	
	@Bean
	public TestControllerClient testControllerClient() {
		return new TestControllerClient();
	}
	
	
	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				EmployeeClientApplication.class, args);
		
		TestControllerClient testControllerClient=ctx.getBean(TestControllerClient.class);
		System.out.println(testControllerClient);
		testControllerClient.getEmployee();
		
	}



}
