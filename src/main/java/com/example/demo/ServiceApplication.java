package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.reindexer.repository.config.EnableReindexerRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.demo"})
@EnableReindexerRepositories(basePackageClasses = TaskViewRepository.class, considerNestedRepositories = true)
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

}
