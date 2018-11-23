package com.wyk.test.handlerdemo.service;

/**
 * @author wyk on 2018/11/23
 */
public interface PointHandlerService<T> {

    /**
     * 增加分值
     * @return
     */
    boolean addPoint(T obj);

    /**
     * 返回的是不同情况下枚举的值
     * @return
     */
    Integer getCode();

    /**
     * 并不是必须的实现
     */
    default boolean notNeedImpl(){
        System.out.println("I am the PointHandlerService");
        return Boolean.TRUE;
    }
}
