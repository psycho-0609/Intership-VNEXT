package com.vnext.demo.component;

import org.springframework.stereotype.Component;

public class ToyotaWheel implements WheelCar{
    @Override
    public String getWheel() {
        return "Đã lắp bánh Toyota";
    }
}
