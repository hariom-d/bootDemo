package com.example;

import com.pkg2.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.pkg2")
public class JavaConfig {

    @Bean(name = "calc")
    public Calculator getCalculator(){
        return new Calculator();
    }
}
