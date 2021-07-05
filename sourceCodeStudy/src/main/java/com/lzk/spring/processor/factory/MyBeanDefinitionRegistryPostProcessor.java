package com.lzk.spring.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author kasuo
 * @date 2021/7/5 10:14 上午
 * BeanFactory的后置处理器  , PriorityOrdered, Ordered
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
    public MyBeanDefinitionRegistryPostProcessor(){
        System.out.println("MyBeanDefinitionRegistryPostProcessor");
    }
    @Override  //紧接着执行
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor....postProcessBeanFactory...");
    }

    @Override  //先执行的
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor...postProcessBeanDefinitionRegistry...");
        //增强bean定义信息的注册中心，比如自己注册组件

    }

    @Override
    public int getOrder() {
        return 0;
        // 数字越小，优先级越高
    }
}

