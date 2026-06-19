package com.reactive_rest_api.reactive_rest_api.student;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "students")
public class Student {

  @Id
  private Integer id;
  private String firstName;
  private String lastName;
  private int age;
}
