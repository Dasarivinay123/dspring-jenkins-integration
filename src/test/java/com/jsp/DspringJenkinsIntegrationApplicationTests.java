package com.jsp;

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
	}

}
