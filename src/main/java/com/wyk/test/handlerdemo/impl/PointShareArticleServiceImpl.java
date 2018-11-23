package com.wyk.test.handlerdemo.impl;

import com.wyk.test.handlerdemo.bo.ShareArticleBO;
import com.wyk.test.handlerdemo.common.constant.PointEnum;
import com.wyk.test.handlerdemo.service.PointHandlerService;
import org.springframework.stereotype.Component;

/**
 * @author wyk on 2018/11/23
 */
@Component
public class PointShareArticleServiceImpl  extends PointBaseSeriveImpl implements PointHandlerService<ShareArticleBO> {
    @Override
    public boolean addPoint(ShareArticleBO shareArticleBO) {
        //这里写上要处理的业务逻辑
        System.out.println("分享文章加分:"+PointEnum.SHARE_ARTICLE.getPoint());
        return Boolean.TRUE;
    }

    @Override
    public Integer getCode() {
        return PointEnum.SHARE_ARTICLE.getCode();
    }
}
