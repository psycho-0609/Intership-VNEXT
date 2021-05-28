package com.vnext.demo.component;

import org.springframework.stereotype.Component;

public class EngineTurbo implements Engine{
    EngineTurbo(){
        System.out.println("Tao Engine tubbor");
    }
    @Override
    public String getEngine() {
        return "Lắp động cơ Turbo";
    }
}
