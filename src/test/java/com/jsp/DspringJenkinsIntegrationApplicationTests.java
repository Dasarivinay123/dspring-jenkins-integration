package com.jsp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class DspringJenkinsIntegrationApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(DspringJenkinsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		logger.info("Second log statement...");
		logger.info("Third log statement...");
		logger.info("Fourth log statement...");
		logger.info("Email Verifiation statement...");
		assertEquals(true,true);
	}

}
