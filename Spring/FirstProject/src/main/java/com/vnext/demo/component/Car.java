package com.vnext.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component

public class Car {

    private WheelCar wheelCar;

    private Engine engine;

    private String nameCar;

    public Car(){

    }

    public void assembleWheel(){
        System.out.println(wheelCar.getWheel());
    }

    public void assembleEngine(){
        System.out.println(engine.getEngine());
    }

    public void run(){
        System.out.println("Phóng như bay =))");
    }

    public String getNameCar(){
        return this.nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public WheelCar getWheelCar() {
        return wheelCar;
    }

    public void setWheelCar(WheelCar wheelCar) {
        this.wheelCar = wheelCar;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
