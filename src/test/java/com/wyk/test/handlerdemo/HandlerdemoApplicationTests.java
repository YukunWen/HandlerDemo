package com.wyk.test.handlerdemo;

import com.wyk.test.handlerdemo.bo.LoginSignBO;
import com.wyk.test.handlerdemo.bo.PublishArticleBO;
import com.wyk.test.handlerdemo.bo.ShareArticleBO;
import com.wyk.test.handlerdemo.common.constant.PointEnum;
import com.wyk.test.handlerdemo.common.init.PointHandlerInterceptor;
import com.wyk.test.handlerdemo.service.PointHandlerService;
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
        PointHandlerService p1 = pointHandlerInterceptor.pointAdd(PointEnum.LOGIN_SIGN.getCode());
        p1.addPoint(new LoginSignBO());
        p1.notNeedImpl();
        PointHandlerService p2 =pointHandlerInterceptor.pointAdd(PointEnum.PUBLISH_ARTICLE.getCode());
        p2.addPoint(new PublishArticleBO());
        p2.notNeedImpl();
        PointHandlerService p3 =pointHandlerInterceptor.pointAdd(PointEnum.SHARE_ARTICLE.getCode());
        p3.addPoint(new ShareArticleBO());
        p3.notNeedImpl();
    }

}
