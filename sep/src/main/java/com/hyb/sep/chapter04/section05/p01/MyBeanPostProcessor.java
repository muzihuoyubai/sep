package com.hyb.sep.chapter04.section05.p01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    private static final Logger LOG = LogManager.getLogger(MyBeanPostProcessor.class.getName());

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        LOG.debug("postProcessBeforeInitialization::o = [{}], s = [{}]", o, s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        LOG.debug("postProcessAfterInitialization::o = [{}], s = [{}]", o, s);
        return o;
    }
}
