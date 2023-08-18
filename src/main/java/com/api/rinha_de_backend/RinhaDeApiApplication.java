package com.api.rinha_de_backend;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication // Enable Spring Boot auto config and component scanning
@EntityScan("com.api.rinha_de_backend.entities") //Scan all entities
@EnableJpaRepositories("com.api.rinha_de_backend") //Scan all repositories -> interfaces que fazem acesso ao banco de dados
public class RinhaDeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RinhaDeApiApplication.class, args);
        System.out.println("Rinha de API rodando na porta 8080");
    }

}
