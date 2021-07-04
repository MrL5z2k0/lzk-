package com.lzk.spring;

import com.lzk.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lzkF
 * @create 2021-06-29 21:28
 */
public class MainTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
    }
}
