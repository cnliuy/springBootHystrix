package com.cu.chinaunicom.springBootHystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication 
@EnableHystrixDashboard  //code change 0
@EnableCircuitBreaker	//code change 1
public class SpringBootHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHystrixApplication.class, args);
	}
}
