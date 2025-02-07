package Log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {
	
	static Logger logger =Logger.getLogger(BasicConfiguratorExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicConfigurator.configure();
		logger.debug("This is Debug Message");
		logger.info("This is an Info message");
		logger.warn("This is Warning Message");
		logger.error("This is an error Message");
		logger.fatal("This is Fatal Message");
		
	}

}
