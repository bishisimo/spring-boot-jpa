package me.bishisimo.springbootjpa.service;

import me.bishisimo.springbootjpa.entity.Student;
import me.bishisimo.springbootjpa.repository.StudentRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Transactional
//    public void addStudent(Student student) {
//        entityManager.persist(student);
//    }
//
//    public Student getStudentById(Long id) {
//        return entityManager.find(Student.class, id);
//    }
    @Resource
    private StudentRepository studentRepository;

    @Transactional
    public void save(Student student){
        studentRepository.save(student);
    }

    @Transactional
    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }

    public Student findStudentById(Long id){
        return studentRepository.findStudentById(id);
    }

    public List<Student> findStudentByName(String name){
        return studentRepository.findStudentByName(name);
    }

    public List<Student> findStudentByAge(int age){
        return studentRepository.findStudentByAge(age);
    }
}
