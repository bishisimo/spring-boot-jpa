package me.bishisimo.springbootjpa.service;

import me.bishisimo.springbootjpa.entity.Course;
import me.bishisimo.springbootjpa.entity.Grade;
import me.bishisimo.springbootjpa.repository.CourseRepository;
import me.bishisimo.springbootjpa.repository.GradeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GradeService {
    @Resource
    private GradeRepository gradeRepository;

    @Transactional
    public void save(Grade grade){
        gradeRepository.save(grade);
    }

    @Transactional
    public void deleteById(Long id){
        gradeRepository.deleteById(id);
    }
    public List<Grade> findGradeByStudentId(Long id){
        return gradeRepository.findGradeByStudentId(id);
    }
    public List<Grade> findGradeByCourseId(Long id){
        return gradeRepository.findGradeByCourseId(id);
    }

    public List<Grade> findGradeByGrade(float grade){
        return gradeRepository.findGradeByGrade(grade);
    }
}
