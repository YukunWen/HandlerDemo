package com.wyk.test.handlerdemo.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wyk on 2018/11/23
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PublishArticleBO extends BasePointBO{

    private String name;
}
