package com.api.rinha_de_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RinhaDeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RinhaDeApiApplication.class, args);
        System.out.println("Rinha de API rodando na porta 8080");
    }

}
