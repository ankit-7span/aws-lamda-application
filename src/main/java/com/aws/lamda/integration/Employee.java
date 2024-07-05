package com.aws.lamda.integration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    Integer id;
    String name;
    String email;
}