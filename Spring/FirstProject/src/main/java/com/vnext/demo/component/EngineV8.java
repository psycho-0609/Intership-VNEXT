package com.vnext.demo.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class EngineV8 implements Engine{

    public EngineV8(){
        System.out.println("Tao engine v8");
    }
    @Override
    public String getEngine() {
        return "Đã lắp động cơ V8";
    }
}
