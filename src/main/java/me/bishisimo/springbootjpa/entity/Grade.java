package me.bishisimo.springbootjpa.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@AccessType(AccessType.Type.FIELD)
@Access(javax.persistence.AccessType.FIELD)
public class Grade {
    @Id
    @EmbeddedId
    private GradeId gradeId;
    private Float grade;

    public GradeId getGradeId() {
        return gradeId;
    }

    public void setGradeId(GradeId gradeId) {
        this.gradeId = gradeId;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }
}


class GradeId implements Serializable {
    private Long studentId;
    private Long courseId;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}