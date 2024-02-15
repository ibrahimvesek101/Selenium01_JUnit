package Day13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C02_Log4j {

    public static void main(String[] args) {

        // Logger with default log4j configuration
        // default log level is error

        Logger logger = LogManager.getLogger(C02_Log4j.class.getName());

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
