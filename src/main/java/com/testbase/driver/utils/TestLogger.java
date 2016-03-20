package com.testbase.driver.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logger class
 */
public class TestLogger {
    public static final Logger LOGGER = LoggerFactory.getLogger(TestLogger.class);

    public static void info(String logMessage) {
        LOGGER.info(logMessage);
    }
}
