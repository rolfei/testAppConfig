package com.rolfei.appConfigTest.testAzureConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class TestAzureConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAzureConfigApplication.class, args);
	}

}
