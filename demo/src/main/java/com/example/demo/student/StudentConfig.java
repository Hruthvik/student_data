package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student hruthvik = new Student(
                    "Hruthvik",
                    "hruthvikraj26@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 26)
            );

            Student frostten = new Student(
                    "Frostten",
                    "frostten06@gmail.com",
                    LocalDate.of(2018, Month.FEBRUARY, 26)
            );

            repository.saveAll(
                    List.of(hruthvik,frostten)
            );
        };
    }
}
