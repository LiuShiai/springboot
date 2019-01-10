package com.shixuntest.springboot.controller;

import com.shixuntest.springboot.entity.Student;
import com.shixuntest.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("stu")
public class StudentController {

    @Autowired
    public StudentService studentService;

    @RequestMapping("/add")
    private Student addStudent(Student student){
        return studentService.addStudent(student);
    }

    @RequestMapping("/all")
    private List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @RequestMapping("/getbyid/id")
    private Student getStuByID(@PathVariable("id")Integer stuID){
        return studentService.getStudentByID(stuID);
    }

    @RequestMapping("/update")
    private Student updateStudent(Student student){
        return studentService.updateStudent(student);
    }

    @RequestMapping("/delete/id")
    private void deleteStudent(@PathVariable("id")Integer stuID){
        studentService.deleteStudent(stuID);
    }
}
