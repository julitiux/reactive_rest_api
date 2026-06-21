package com.reactive_rest_api.reactive_rest_api.student;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class StudentService {

  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public Flux<Student> findAll(){
    return studentRepository.findAll();
  }
}
