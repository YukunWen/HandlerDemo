package com.wyk.test.handlerdemo.common.init;

import com.wyk.test.handlerdemo.service.PointHandlerService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 初始化pointHandler
 * @author wyk on 2018/11/23
 */
@Component
public class PointHandlerInterceptor implements InitializingBean, ApplicationContextAware {

    private Map<Integer, PointHandlerService> pointHandlers = new HashMap<>();

    private ApplicationContext applicationContext;

    public Boolean pointAdd(Integer type){
        PointHandlerService pointHandlerService = pointHandlers.get(type);
        return pointHandlerService.addPoint();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, PointHandlerService> noticeHandlerBeans = applicationContext.getBeansOfType(PointHandlerService.class);
        Collection<PointHandlerService> values = noticeHandlerBeans.values();
        for (PointHandlerService noticeHandler : values) {
            Integer type = noticeHandler.getCode();
            pointHandlers.put(type, noticeHandler);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
