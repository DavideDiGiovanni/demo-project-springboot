package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.JUNE;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student dave = new Student(
                    "Dave",
                    "dave.jones@gmail.it",
                    LocalDate.of(1991, JUNE, 28)
            );

            Student alex = new Student(
                    "Alex",
                    "alex.pokovitz@gmail.it",
                    LocalDate.of(2000, APRIL, 2)
            );

            repository.saveAll(
                    List.of(dave, alex)
            );
        };
    }
}
