package com.abigoscode.SpringAmbigo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
    return args -> {
//      Student parth = new Student("Parth Solanki" , "parth@gmail.com" , LocalDate.of(2000, Month.DECEMBER,18),22 );
//      Student arpit = new Student("Arpit Panchal" , "arpit@gmail.com" , LocalDate.of(2001, Month.JANUARY,21),20);
      Student mihir = new Student("Mihir Parmar" , "mihir@gmail.com" , LocalDate.of(2002 ,Month.JANUARY , 30),19);
    studentRepository.saveAll(List.of(mihir));
    };

  }

}
