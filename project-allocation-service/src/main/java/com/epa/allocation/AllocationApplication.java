package com.epa.allocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.epa.allocation.feign.client")
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class AllocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllocationApplication.class, args);
	}

}
