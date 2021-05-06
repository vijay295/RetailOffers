package com.code.retailoffers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RetailoffersApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RetailoffersApplication.class, args);
        Test test = context.getBean(Test.class);
        test.retail();
    }

}
