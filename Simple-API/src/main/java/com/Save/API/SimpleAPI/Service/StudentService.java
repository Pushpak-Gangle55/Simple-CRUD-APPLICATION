package com.Save.API.SimpleAPI.Service;

import com.Save.API.SimpleAPI.Entity.Student;
import com.Save.API.SimpleAPI.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveDetails(Student student) {

        return studentRepository.save(student);
    }

    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

    public List<Student> getStudentList() {

        return (List<Student>) studentRepository.findAll();
    }

    public Student updateStudentDetails(Student student, int id) {

        Student studentDB = studentRepository.findById(id).get();

        if (Objects.nonNull(student.getName()) && !"".equalsIgnoreCase(student.getName())) {
            studentDB.setName(student.getName());
        }

        if (Objects.nonNull(student.getMark()) && !"".equalsIgnoreCase(String.valueOf(student.getMark()))) {
            studentDB.setMark(student.getMark());
        }

        return studentRepository.save(studentDB);

    }
}
