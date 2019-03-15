package me.bishisimo.springbootjpa.entity;

import javax.persistence.*;

@Entity
@Access(javax.persistence.AccessType.FIELD)

public class Course{
    @Id
    private Long courseId;
    @Column(length = 64)
    private String courseName;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}