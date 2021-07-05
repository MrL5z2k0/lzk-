package com.lzk.spring;

import com.lzk.spring.bean.Person;
import com.lzk.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author kasuo
 * @date 2021/6/30 9:58 上午
 * 注解版Spring的用法
 */
public class AnnotationMainTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        //Person bean = applicationContext.getBean(Person.class);
        //System.out.println(bean);

        //String[] names = applicationContext.getBeanDefinitionNames();
        //for (String name : names) {
        //    System.out.println(name);
        //}

        //Cat bean1 = applicationContext.getBean(Cat.class);
        //
		//Cat bean2 = applicationContext.getBean(Cat.class);
        //
        //// false
		//System.out.println(bean1 == bean2);

        //Person bean1 = applicationContext.getBean(Person.class);
		//
		//Cat cat = bean1.getCat();
		//
		//Person bean2 = applicationContext.getBean(Person.class);
		//
		//Cat cat1 = bean2.getCat();
        ////true
		//System.out.println(cat1 == cat);
		//System.out.println(cat1);

		//Person bean = applicationContext.getBean(Person.class);
		//
		//ApplicationContext context = bean.getContext();
		//
		//System.out.println(context == applicationContext);



	}

}
