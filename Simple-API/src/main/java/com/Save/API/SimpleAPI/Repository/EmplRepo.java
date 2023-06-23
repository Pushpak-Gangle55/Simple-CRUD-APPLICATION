package com.Save.API.SimpleAPI.Repository;

import com.Save.API.SimpleAPI.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplRepo extends JpaRepository<Employee,Integer> {
}
