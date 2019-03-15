package me.bishisimo.springbootjpa.repository;

import me.bishisimo.springbootjpa.entity.Grade;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GradeRepository extends CrudRepository<Grade, Long>, JpaSpecificationExecutor<Grade> {
    @Query("select u from Grade u where u.gradeId.studentId=?1")
    List<Grade> findGradeByStudentId(Long id);

    @Query("select u from Grade u where u.gradeId.courseId=?1")
    List<Grade> findGradeByCourseId(Long id);

    @Query("select u from Grade u where u.grade =?1")
    List<Grade> findGradeByGrade(float grade);
}
