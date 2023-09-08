package com.geeksforless.tuleninov.threadpool.homework.model;

import java.util.Objects;

public class ThreadPoolConfig {
    private Integer corePoolSize;
    private Long keepAliveTime;
    private Integer maximumPoolSize;

    public ThreadPoolConfig(Integer corePoolSize, Long keepAliveTime, Integer maximumPoolSize) {
        this.corePoolSize = corePoolSize;
        this.keepAliveTime = keepAliveTime;
        this.maximumPoolSize = maximumPoolSize;
    }

    public Integer getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(Integer corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public Long getKeepAliveTime() {
        return keepAliveTime;
    }

    public void setKeepAliveTime(Long keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }

    public Integer getMaximumPoolSize() {
        return maximumPoolSize;
    }

    public void setMaximumPoolSize(Integer maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreadPoolConfig that = (ThreadPoolConfig) o;
        return Objects.equals(corePoolSize, that.corePoolSize) && Objects.equals(keepAliveTime, that.keepAliveTime) && Objects.equals(maximumPoolSize, that.maximumPoolSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corePoolSize, keepAliveTime, maximumPoolSize);
    }
}
