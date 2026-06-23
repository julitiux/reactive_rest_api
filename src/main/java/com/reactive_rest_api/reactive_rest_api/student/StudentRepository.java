package com.reactive_rest_api.reactive_rest_api.student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {

  Flux<Student> findAllByFirstnameIgnoreCase(String firstName);
}
