package com.cad.carlink.data.utils;

import org.apache.log4j.Logger;

public class LoggerUtils {
    private static org.apache.log4j.Logger logger = Logger.getLogger(LoggerUtils.class);

    public static  void info(String msg) {
        logger.info ( msg );
    }
}
