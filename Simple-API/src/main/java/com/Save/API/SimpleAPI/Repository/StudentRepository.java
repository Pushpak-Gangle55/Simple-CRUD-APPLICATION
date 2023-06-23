package com.Save.API.SimpleAPI.Repository;

import com.Save.API.SimpleAPI.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
