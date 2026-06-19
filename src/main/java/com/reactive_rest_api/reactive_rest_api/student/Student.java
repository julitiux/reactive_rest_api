package com.reactive_rest_api.reactive_rest_api.student;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

  private Integer id;
  private String firstName;
  private String lastName;
  private int age;
}
