package com.rolfei.appConfigTest.testAzureConfig;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(properties = "spring.cloud.azure.appconfiguration.enabled=false")
class TestAzureConfigApplicationTests {

	@Test
	void contextLoads() {
	}

}
