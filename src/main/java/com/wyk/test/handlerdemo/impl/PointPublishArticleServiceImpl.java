package com.wyk.test.handlerdemo.impl;

import com.wyk.test.handlerdemo.common.constant.PointEnum;
import com.wyk.test.handlerdemo.service.PointHandlerService;
import org.springframework.stereotype.Component;

/**
 * @author wyk on 2018/11/23
 */
@Component
public class PointPublishArticleServiceImpl implements PointHandlerService {
    @Override
    public boolean addPoint() {
        //这里写上要处理的业务逻辑
        System.out.println("发布文章加分:"+PointEnum.PUBLISH_ARTICLE.getPoint());
        return Boolean.TRUE;
    }

    @Override
    public Integer getCode() {
        return PointEnum.PUBLISH_ARTICLE.getCode();
    }
}
