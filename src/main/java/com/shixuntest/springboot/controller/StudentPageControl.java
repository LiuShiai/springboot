package com.shixuntest.springboot.controller;

import com.shixuntest.springboot.entity.Student;
import com.shixuntest.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("web")
public class StudentPageControl {
    @Autowired
    private StudentService studentService;

    @GetMapping("all")
    public String getAllStu(Model model){
        List<Student> lists = studentService.getAllStudent();
        model.addAttribute("stus",lists);
        return "stuList";
    }

    @GetMapping("toAdd")
    public String toAdd(){
        return "stuAdd";
    }

    @RequestMapping("add")
    public String addStudent(Student stu){
        studentService.addStudent(stu);
        return "redirect:/web/all";
    }

    @RequestMapping("toEdit")
    public String toEdit(Model model, Integer id){
        Student stu = studentService.getStudentByID(id);
        model.addAttribute("stu",stu);
        return "stuEdit";
    }

    @RequestMapping("edit")
    public String updateStu(Student student){
        System.out.println("studentID:"+student.getStuID());
        studentService.updateStudent(student);
        return "redirect:/web/all";
    }

    @RequestMapping("delete")
    public String deleteStu(Integer id){
        studentService.deleteStudent(id);
        return "redirect:/web/all";
    }
}
