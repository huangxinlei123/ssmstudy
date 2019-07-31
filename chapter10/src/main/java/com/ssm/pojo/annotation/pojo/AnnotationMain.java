package com.ssm.pojo.annotation.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version: V1.0
 * @author: xinlei
 * @className: AnnotationMain
 * @packageName: com.ssm.pojo.annotation.pojo
 * @description:
 * @data: 2019-07-30 15:17
 **/
public class AnnotationMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
        Role role = context.getBean(Role.class);
        System.out.println(role.getId());
    }
}
