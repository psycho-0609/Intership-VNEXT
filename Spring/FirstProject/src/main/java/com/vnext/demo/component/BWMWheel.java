package com.vnext.demo.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class BWMWheel implements WheelCar{

    @Override
    public String getWheel() {
        return "Đã lắp bánh BWM";
    }
}
