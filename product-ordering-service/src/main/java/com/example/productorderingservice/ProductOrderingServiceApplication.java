package com.example.productorderingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ProductOrderingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductOrderingServiceApplication.class, args);
    }

}
