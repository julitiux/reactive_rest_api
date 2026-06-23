package com.reactive_rest_api.reactive_rest_api.student;

import lombok.Getter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

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

  @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  Flux<Student> findAll(){
    return studentService.findAll()
      .delayElements(Duration.ofSeconds(1));
  }

  @GetMapping("/{id}")
  public Mono<Student> finndById(@PathVariable("id") Integer id){
    return studentService.findId(id);
  }
}
