package com.example.jokeapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app.xml")
public class JokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeApplication.class, args);
    }

}
