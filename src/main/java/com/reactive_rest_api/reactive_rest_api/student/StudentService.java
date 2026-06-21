package com.reactive_rest_api.reactive_rest_api.student;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService {

  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public Mono<Student> save(Student student) {
    return studentRepository.save(student);
  }

  public Flux<Student> findAll(){
    return studentRepository.findAll();
  }

  public Mono<Student> findId(Integer id){
    return studentRepository.findById(id);
  }
}
