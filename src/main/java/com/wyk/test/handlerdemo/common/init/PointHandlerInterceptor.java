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
 *
 * @author wyk on 2018/11/23
 */
@Component
public class PointHandlerInterceptor implements InitializingBean, ApplicationContextAware {

    /**
     * 内部维护的Map
     */
    private Map<Integer, PointHandlerService> pointHandlers = new HashMap<>();

    private ApplicationContext applicationContext;

    /**
     * 公共的方法
     *
     * @param type
     * @return
     */
    public PointHandlerService pointAdd(Integer type) {
        return pointHandlers.get(type);
    }

    /**
     * 初始化pointHandlers这个Map
     *
     * @throws Exception
     */
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
