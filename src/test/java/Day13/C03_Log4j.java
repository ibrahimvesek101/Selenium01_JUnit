package Day13;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;

public class C03_Log4j {
    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");
        Logger logger = Logger.getLogger(C03_Log4j.class);

        // trace
        logger.trace("This is trace message");

        //debug
        logger.debug("This is debug message");

        //info
        logger.info("This is info message");

        //warn
        logger.warn("This is warning message");

        //error
        logger.error("This is error message");

        //fatal
        logger.fatal("This is fatal message");

    }
}