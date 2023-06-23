package com.Save.API.SimpleAPI.Controller;

import com.Save.API.SimpleAPI.Entity.Student;
import com.Save.API.SimpleAPI.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

        @Autowired
         StudentService studentService;

        @PostMapping("/addStudent")
        public Student postDetails(@RequestBody Student student){

                return studentService.saveDetails(student);
        }


        @DeleteMapping("/addStudent/{Id}")
        public String deleteStudent( @PathVariable("Id") int id){

                 studentService.deleteStudentById(id);

                 return "Student Deleted Successfully";
        }

        @GetMapping("/Students")
        public List<Student>getStudent(){

            return studentService.getStudentList();
        }

        @PutMapping("/Students/{Id}")
        public String updateStudentDetails(@RequestBody Student student,
                                           @PathVariable("Id") int id){

                studentService.updateStudentDetails(student,id);
            return "Updated Succesfully";
        }
}
