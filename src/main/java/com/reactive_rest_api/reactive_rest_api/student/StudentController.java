package com.reactive_rest_api.reactive_rest_api.student;

import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @PostMapping
  Mono<Student> save(@RequestBody Student student) {
    return studentService.save(student);
  }

  @GetMapping
  Flux<Student> findAll(){
    return studentService.findAll();
  }

  @GetMapping("/{id}")
  public Mono<Student> finndById(@PathVariable("id") Integer id){
    return studentService.findId(id);
  }
}
