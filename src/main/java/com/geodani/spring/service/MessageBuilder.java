package com.geodani.spring.service;


import org.springframework.stereotype.Component;

@Component
public class MessageBuilder {

    public String createMessage(){
        System.out.println("Message created");

        return "text";
    }
}
