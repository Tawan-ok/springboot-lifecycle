package com.example.BeanLifecycleDemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public MyBean() {
        System.out.println("1️⃣ Constructor: MyBean is being created.");
    }

    @PostConstruct
    public void init() {
        System.out.println("2️⃣ @PostConstruct: Bean is ready for use.");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("3️⃣ @PreDestroy: Bean is about to be destroyed.");
    }
}
