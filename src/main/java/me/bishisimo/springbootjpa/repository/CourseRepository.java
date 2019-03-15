package me.bishisimo.springbootjpa.repository;

import me.bishisimo.springbootjpa.entity.Course;
import me.bishisimo.springbootjpa.entity.Student;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long>, JpaSpecificationExecutor<Course> {
    @Query("select u from Course u where u.courseId =?1")
    Course findCourseById(Long id);

    @Query("select u from Course u where u.courseName =?1")
    List<Course> findCourseByName(String name);

}
