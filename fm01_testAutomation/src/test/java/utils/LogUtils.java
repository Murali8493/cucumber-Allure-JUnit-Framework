package utils;

import org.apache.log4j.PropertyConfigurator;

import org.apache.log4j.Logger;

public class LogUtils {

    private static final Logger log = Logger.getLogger(LogUtils.class.getName());

//    public LogUtils(){
//        PropertyConfigurator.configure(Constants.log4jPropPath);
////        log = Logger.
//    }

    public static void info(String message) {
        log.info(message);
    }

    public static void debug(String message) {
        log.debug(message);
    }

    public static void error(String message) {
        log.error(message);
    }
}
