package com.vnext.demo;

//import com.vnext.demo.bean.Shirt;
import com.vnext.demo.component.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Beans.xml")
public class DemoApplication {

    public static void main(String[] args) {

//        System.out.println("> Trước khi IoC Container được khởi tạo");
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        System.out.println("> Sau khi IoC Container được khởi tạo");
//        Shirt shirt = context.getBean(Shirt.class);
//        System.out.println("> Trước khi IoC Container destroy Shirt");
//        ((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(shirt);
//        System.out.println("> Sau khi IoC Container destroy Shirt ");
        Car car = context.getBean(Car.class);
        System.out.println("Tên xe là "+car.getNameCar());
        car.getNameCar();
        car.assembleWheel();
        car.assembleEngine();
        car.run();



    }


}
