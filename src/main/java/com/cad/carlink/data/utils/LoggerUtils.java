package com.cad.carlink.data.utils;

import com.cad.carlink.data.client.ImpTiOwnerClient;

import java.util.logging.Logger;

public class LoggerUtils {
    static Logger logger = Logger.getLogger ( ImpTiOwnerClient.class.getName () );

    public static  void info(String msg) {
        logger.info ( msg );
    }
}
