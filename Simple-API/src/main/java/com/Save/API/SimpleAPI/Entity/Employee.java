package com.Save.API.SimpleAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Employee_details")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name = "Em-id")
    private int empid;

    @Column(name = "emp_name")
    private String name;
}
