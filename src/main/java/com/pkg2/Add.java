package com.pkg2;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:dev.properties")
@PropertySource({"classpath:${env}/dev.properties"})

@Data
public class Add {
    private static final Logger logger = LogManager.getLogger(Add.class);

    @Value("${add.a}")
    int a;
    @Value("${add.b}")
    int b;

    @Value("#{30+20}")
    int c;

    @Autowired
    private Environment env;

    public Add() {

    }

    public int addition() {
//        printEnvs();
        return this.a + this.b+ this.c;
    }

    public int addition(int a, int b, int c) {
        return a + b + c;
    }


    //Environment is used for all types of system properties
    void printEnvs() {
        System.out.println("city=" + env.getProperty("city"));
        System.out.println("Java home=" + env.getProperty("JAVA_HOME"));
        System.out.println("env value=" + env.getProperty("env"));
//        logger.info("This is a log message from printEnvs() method");


    }
}
