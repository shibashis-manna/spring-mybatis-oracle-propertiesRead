package au.com.wp.corp.integration.noah.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.wp.corp.integration.noah.repository.mapper.POAMapperDao;

@Service
public class PofTest {

	private static final Logger LOG = LoggerFactory.getLogger(PofTest.class);
	
	@Autowired
	POAMapperDao pofDao;
	
	public List<String> getIncidents()  {
		return pofDao.getIncidents();
	}
	
	public void sayHello() {
		LOG.info("Welcome to POF World... going to get data");
		List<String>  list = getIncidents();
		for(String str:list) System.out.println(str);
	}
	
	
}
