package au.com.wp.corp.integration.noah.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NoahMainService {
	private static final Logger LOG = LoggerFactory.getLogger(NoahMainService.class);
	
	public static void main(String[] args) {
		LOG.info("Initiaizing Netwrok Operation Application HUB(NOAH) Application Context...");
		
		try {
		ApplicationContext context = new ClassPathXmlApplicationContext("noah-applicationContext.xml");
		LOG.info("NOAH Application Context Initialized...");
		PofTest obj = context.getBean(PofTest.class);
		obj.sayHello();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		LOG.info("Exiting NOAH Application");
	}

}
