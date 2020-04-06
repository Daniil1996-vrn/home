package com.soapService.SOAP;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapApplication {

	private static final Logger logger = LogManager.getLogger(SoapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SoapApplication.class, args);
		//private static Logger logger = LoggerFactory.getLogger(YourClass.class);
	}

	//@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		/*logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Hey, This is a warning!");
		logger.error("Oops! We have an Error. OK");
		logger.fatal("Damn! Fatal error. Please fix me.");*/
	}

}
