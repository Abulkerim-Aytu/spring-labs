package com.cydeo.lab09rest;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class Lab08RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab08RestApplication.class, args);
    }
    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }

}
