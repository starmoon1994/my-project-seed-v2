package com.company.project;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//@EnableAspectJAutoProxy
@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ImportResource(locations = {"classpath:spring-bean.xml", "classpath:spring-druid.xml"})
@MapperScan("com.company.project.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }


    @Bean
    public ThreadPoolExecutor threadPoolExecutor() {
        ThreadFactory factory = new ThreadFactoryBuilder()
                .setNameFormat("base-pool-%d").build();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 30000, TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(1000), factory);

        return threadPoolExecutor;
    }
}

