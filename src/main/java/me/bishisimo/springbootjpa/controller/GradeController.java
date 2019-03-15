package me.bishisimo.springbootjpa.controller;

import me.bishisimo.springbootjpa.entity.Course;
import me.bishisimo.springbootjpa.entity.Grade;
import me.bishisimo.springbootjpa.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @PostMapping("save")
    public Map<String,Object> save(@RequestBody Grade grade){
        Map<String,Object>respond=new HashMap<>();
        gradeService.save(grade);
        respond.put("Success",grade.getGradeId());
        return respond;
    }
    @GetMapping("getById")
    public List<Grade> getCourseById(@RequestParam(value = "studentId") Long id) {
        return gradeService.findGradeByStudentId(id);
    }

    @GetMapping("getByName")
    public List<Grade> getCourseByName(@RequestParam(value = "grade")float grade){
        return gradeService.findGradeByGrade(grade);
    }
}
