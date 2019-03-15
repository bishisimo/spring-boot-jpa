package me.bishisimo.springbootjpa.controller;

import me.bishisimo.springbootjpa.entity.Grade;
import me.bishisimo.springbootjpa.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("grade")
public class GradeController {
    @Autowired
    private GradeRepository gradeRepository;

    @PostMapping("save")
    public Map<String,Object> save(@RequestBody Grade grade){
        Map<String,Object>respond=new HashMap<>();
        gradeRepository.save(grade);
        respond.put("Success",grade.getGradeId());
        return respond;
    }
    @GetMapping("getById")
    public List<Grade> getCourseById(@RequestParam(value = "studentId") Long id) {
        return gradeRepository.findGradeByStudentId(id);
    }

    @GetMapping("getByName")
    public List<Grade> getCourseByName(@RequestParam(value = "grade")float grade){
        return gradeRepository.findGradeByGrade(grade);
    }
}
