package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
    @RestController
    class HelloController {

        @GetMapping("/")
        public String index() {
            return "Hello ! \n Name: Anindita \n Email: aninditaharvey.kashinath@kickdrumtech.com";
        }

        @GetMapping("/hello")
        public String hello() {
            return "Hello ! \n Name: Anindita \n Email: aninditaharvey.kashinath@kickdrumtech.com";
        }
    }
}
