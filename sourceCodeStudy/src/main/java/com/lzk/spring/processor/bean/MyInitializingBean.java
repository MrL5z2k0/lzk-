package com.lzk.spring.processor.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author kasuo
 * @date 2021/7/5 5:37 下午
 */
public class MyInitializingBean implements InitializingBean {

    public MyInitializingBean(){
        System.out.println("MyInitializingBean......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyInitializingBean...afterPropertiesSet");
    }

}
