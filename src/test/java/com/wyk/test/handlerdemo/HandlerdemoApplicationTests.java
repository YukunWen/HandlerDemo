package com.wyk.test.handlerdemo;

import com.wyk.test.handlerdemo.common.constant.PointEnum;
import com.wyk.test.handlerdemo.common.init.PointHandlerInterceptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HandlerdemoApplicationTests {

    @Autowired
    private PointHandlerInterceptor pointHandlerInterceptor;

    @Test
    public void contextLoads() {
        pointHandlerInterceptor.pointAdd(PointEnum.LOGIN_SIGN.getCode());
        pointHandlerInterceptor.pointAdd(PointEnum.PUBLISH_ARTICLE.getCode());
        pointHandlerInterceptor.pointAdd(PointEnum.SHARE_ARTICLE.getCode());
    }

}
