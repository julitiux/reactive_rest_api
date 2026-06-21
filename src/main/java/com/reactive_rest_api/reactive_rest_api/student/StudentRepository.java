package com.reactive_rest_api.reactive_rest_api.student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {
}
