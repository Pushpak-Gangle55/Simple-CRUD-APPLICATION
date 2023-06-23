package com.Save.API.SimpleAPI.Service;

import com.Save.API.SimpleAPI.Entity.Employee;
import com.Save.API.SimpleAPI.Repository.EmplRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmplRepo emplRepo;



    public Employee saveEmployeeDetails(Employee employee){

        return emplRepo.save(employee);
    }



}
