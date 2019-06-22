package com.geodani.spring;

import com.geodani.spring.config.AppConfig;
import com.geodani.spring.service.MessageSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender sender = ctx.getBean(MessageSender.class);
        sender.sendMessage();
    }

}
