package com.Save.API.SimpleAPI.Controller;


import com.Save.API.SimpleAPI.Entity.Employee;
import com.Save.API.SimpleAPI.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee employeePostDetails(@RequestBody Employee employee){

        return employeeService.saveEmployeeDetails(employee);
    }
}
