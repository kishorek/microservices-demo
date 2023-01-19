package com.msdemo;

import com.msdemo.repositories.RideRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner checkDB(RideRepository repository){
        return (args) -> {
            System.out.println(repository.findAll());
            System.out.println(repository.findByFromAndTo("Chennai","Pondicherry"));
        };
    }
}