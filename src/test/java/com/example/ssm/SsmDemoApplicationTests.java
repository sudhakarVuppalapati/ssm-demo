package com.example.ssm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

@SpringBootTest
@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class) 
@ActiveProfiles("dev")
@RunWith(SpringRunner.class)
class SsmDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
