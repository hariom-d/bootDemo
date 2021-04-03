package com.example;

import com.pkg2.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BootDemoApplication {
    private static final Logger logger = LogManager.getLogger(BootDemoApplication.class);

    public static void main(String[] args) {
//        System.setProperty("env", "dev");
//        ApplicationContext ctx = SpringApplication.run(BootDemoApplication.class, args);
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        Calculator calc = ctx.getBean("calc", Calculator.class);

        int a= calc.getAdd().getA();
        int b= calc.getAdd().getB();
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        int x = calc.getAdd().addition();
        System.out.println("x=" + x);
//        logger.info("x=" + x);
        //BootDemoApplication bootDemoApplication = new BootDemoApplication();

    }
}
