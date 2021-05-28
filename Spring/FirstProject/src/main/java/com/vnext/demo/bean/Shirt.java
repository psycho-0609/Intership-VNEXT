package com.vnext.demo.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Shirt {
    @PostConstruct
    public void postConstruct(){
        System.out.println("\t>> Đối tượng Shirt sau khi khởi tạo xong sẽ chạy hàm này");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("\t>> Đối tượng Shirt trước khi bị destroy thì chạy hàm này");
    }
}
