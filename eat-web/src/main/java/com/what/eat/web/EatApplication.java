package com.what.eat.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ImportResource(locations={"classpath:spring/spring-datasource.xml"})
@ComponentScan(value="com.what.eat")
@MapperScan(value = "com.what.eat.dao.mapper")
@EnableTransactionManagement
@ServletComponentScan
public class EatApplication {

    public static void main(String[] args) {
        SpringApplication.run(EatApplication.class, args);
    }


}

