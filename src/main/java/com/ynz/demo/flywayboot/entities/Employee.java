package com.ynz.demo.flywayboot.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private String employeeId;

    private String name;
    private String email;
    private LocalDate employedDate;
}
