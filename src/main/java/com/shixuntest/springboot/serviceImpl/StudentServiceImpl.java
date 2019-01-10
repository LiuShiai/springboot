package com.shixuntest.springboot.serviceImpl;

import com.shixuntest.springboot.entity.Student;
import com.shixuntest.springboot.repository.StudentRepository;
import com.shixuntest.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer stuID){
        studentRepository.deleteById(stuID);
    }

    @Override
    public Student getStudentByID(Integer stuID){
        return studentRepository.findById(stuID).get();
    }
}
