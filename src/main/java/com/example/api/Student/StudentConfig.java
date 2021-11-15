package com.example.api.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
         Student nacer=   new Student(1L,"nacer", LocalDate.of(2000, Month.JANUARY,12),"nanan@gmail.com");
         Student yasmine=   new Student(2L,"yasmine", LocalDate.of(2000, Month.JANUARY,18),"Yasmine@gmail.com");
            repository.saveAll(List.of(nacer,yasmine));
        };


    }
}
