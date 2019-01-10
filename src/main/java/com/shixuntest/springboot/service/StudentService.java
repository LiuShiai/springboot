package com.shixuntest.springboot.service;

import com.shixuntest.springboot.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    Student addStudent(Student student);

    List<Student> getAllStudent();

    Student updateStudent(Student student);

    void deleteStudent(Integer stuID);

    Student getStudentByID(Integer stuID);
}
