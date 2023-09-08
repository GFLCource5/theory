package com.geeksforless.tuleninov.threadpool.homework.config.beans;

import com.geeksforless.tuleninov.threadpool.homework.config.properties.PropertiesConfig;
import com.geeksforless.tuleninov.threadpool.homework.model.ThreadPoolConfig;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static com.geeksforless.tuleninov.threadpool.homework.config.properties.PropertiesConstants.*;

/**
 * Class for creating beans from properties file.
 *
 *  @author Oleksandr Tuleninov
 *  @version 01
 * */
public class BeanConfig {

    private final PropertiesConfig propertiesConfig;

    public BeanConfig(PropertiesConfig propertiesConfig) {
        this.propertiesConfig = propertiesConfig;
    }

    /**
     * Create ThreadPoolConfig bean from properties file.
     * */
    public ThreadPoolConfig threadPoolConfig() {
        var properties = propertiesConfig.getProperties(THREAD_POOL_PROPERTIES);
        var corePoolSize = Integer.parseInt(properties.getProperty(CORE_POOL_SIZE));
        var keepAliveTime = Long.parseLong(properties.getProperty(KEEP_ALIVE_TIME));
        var maximumPoolSize = Integer.parseInt(properties.getProperty(MAXIMUM_POOL_SIZE));

        return new ThreadPoolConfig(corePoolSize, keepAliveTime, maximumPoolSize);
    }

    /**
     * Create ThreadPoolExecutor bean from properties file.
     * */
    public ThreadPoolExecutor threadPoolExecutor(ThreadPoolConfig threadPoolConfig) {
        return new ThreadPoolExecutor(
                threadPoolConfig.getCorePoolSize(),
                threadPoolConfig.getMaximumPoolSize(),
                threadPoolConfig.getKeepAliveTime(),
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>());
    }
}
