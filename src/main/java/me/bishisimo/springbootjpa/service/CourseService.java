package me.bishisimo.springbootjpa.service;

import me.bishisimo.springbootjpa.entity.Course;
import me.bishisimo.springbootjpa.repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseService {
    @Resource
    private CourseRepository courseRepository;

    @Transactional
    public void save(Course course){
        courseRepository.save(course);
    }

    @Transactional
    public void deleteById(Long id){
        courseRepository.deleteById(id);
    }

    public Course findCourseById(Long id){
        return courseRepository.findCourseById(id);
    }

    public List<Course> findCourseByName(String name){
        return courseRepository.findCourseByName(name);
    }
}
