package com.wyk.test.handlerdemo.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 加分项的枚举类
 * @author wyk on 2018/11/23
 */
@AllArgsConstructor
@Getter
public enum PointEnum {

    /**
     * 编号1：发布文章，增加2分
     */
    PUBLISH_ARTICLE(1,2),
    /**
     * 编号2：分享文章，增加3分
     */
    SHARE_ARTICLE(2,3),
    /**
     * 编号3：登录签到，增加1分
     */
    LOGIN_SIGN(3,1);
    ;

    /**
     * 编号
     */
    private Integer code;

    /**
     * 分值
     */
    private Integer point;
}
