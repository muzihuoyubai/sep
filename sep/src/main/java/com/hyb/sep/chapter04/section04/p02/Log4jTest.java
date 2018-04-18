package com.hyb.sep.chapter04.section04.p02;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jTest {
    private static final Logger LOG = LogManager.getLogger(Log4jTest.class.getName());

    public static void main(String[] args) {
        LOG.trace("trace message");
        LOG.debug("debug message");
        LOG.info("info message");
        LOG.warn("warn message");
        LOG.error("error message");
        LOG.fatal("fatal message");
        System.out.println("Hello World!");
    }
}
