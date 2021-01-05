package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ImportResource(locations = {"classpath:spring-bean.xml", "classpath:spring-druid.xml"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}

