package com.reactive_rest_api.reactive_rest_api;

import com.reactive_rest_api.reactive_rest_api.student.Student;
import com.reactive_rest_api.reactive_rest_api.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveRestApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReactiveRestApiApplication.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(StudentService studentService) {
    return args -> {
      for (int i = 0; i < 100; i++) {
        studentService.save(
          Student.builder()
            .firstname("firstmame" + i)
            .lastname("lastname" + i)
            .age(i)
            .build()
        );
      }
    };
  }
}
