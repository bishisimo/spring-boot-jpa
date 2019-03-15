package me.bishisimo.springbootjpa.controller;

import me.bishisimo.springbootjpa.entity.Course;
import me.bishisimo.springbootjpa.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("save")
    public Map<String,Object> save(@RequestBody Course course){
        Map<String,Object>respond=new HashMap<>();
        courseRepository.save(course);
        respond.put("Success",course.getCourseId());
        return respond;
    }
    @GetMapping("getById")
    public Course getCourseById(@RequestParam(value = "id") Long id) {
        return courseRepository.findCourseById(id);
    }

    @GetMapping("getByName")
    public List<Course> getCourseByName(@RequestParam(value = "name")String name){
        return courseRepository.findCourseByName(name);
    }
}
