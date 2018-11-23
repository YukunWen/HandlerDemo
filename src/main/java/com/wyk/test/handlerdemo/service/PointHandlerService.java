package com.wyk.test.handlerdemo.service;

/**
 * @author wyk on 2018/11/23
 */
public interface PointHandlerService {

    /**
     * 增加分值
     * @return
     */
    boolean addPoint();

    /**
     * 返回的是不同情况下枚举的值
     * @return
     */
    Integer getCode();
}
