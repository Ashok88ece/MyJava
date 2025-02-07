package Log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExample {
	
	static Logger logger =Logger.getLogger(PropertyLog4jExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("Log4j.properties");
		logger.debug("This is Debug Message");
		logger.info("This is an Info message");
		logger.warn("This is Warning Message");
		logger.error("This is an error Message");
		logger.fatal("This is Fatal Message");
	}

}
