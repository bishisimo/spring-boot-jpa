package me.bishisimo.springbootjpa.controller;

import me.bishisimo.springbootjpa.entity.Student;
import me.bishisimo.springbootjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("save")
    public Map<String,Object> save(@RequestBody Student student) {
        Map<String,Object> respond=new HashMap<>();
        studentRepository.save(student);
        respond.put("Success",student.getStudentId());
        return respond;
    }

    @GetMapping("getById")
    public Student getStudentById(@RequestParam(value = "id") Long id) {
        return studentRepository.findStudentById(id);
    }

    @GetMapping("getByName")
    public List<Student> getStudentByName(@RequestParam(value = "name")String name){
        return studentRepository.findStudentByName(name);
    }

    @GetMapping("getByAge")
    public List<Student> getStudentByAge(@RequestParam(value = "age")int age){
        return studentRepository.findStudentByAge(age);
    }
}
