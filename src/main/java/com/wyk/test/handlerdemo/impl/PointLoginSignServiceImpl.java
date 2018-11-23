package com.wyk.test.handlerdemo.impl;

import com.wyk.test.handlerdemo.bo.LoginSignBO;
import com.wyk.test.handlerdemo.common.constant.PointEnum;
import com.wyk.test.handlerdemo.service.PointHandlerService;
import org.springframework.stereotype.Component;

/**
 * @author wyk on 2018/11/23
 */
@Component
public class PointLoginSignServiceImpl extends PointBaseSeriveImpl implements PointHandlerService<LoginSignBO> {
    @Override
    public boolean addPoint(LoginSignBO loginSignBO) {
        //这里写上要处理的业务逻辑
        System.out.println("登录加分:"+PointEnum.LOGIN_SIGN.getPoint());
        return Boolean.TRUE;
    }

    @Override
    public Integer getCode() {
        return PointEnum.LOGIN_SIGN.getCode();
    }

    @Override
    public boolean notNeedImpl(){
        System.out.println("I am the PointLoginSignServiceImpl");
        return Boolean.TRUE;
    }
}
