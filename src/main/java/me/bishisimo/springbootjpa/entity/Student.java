package me.bishisimo.springbootjpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Access(javax.persistence.AccessType.FIELD)

public class Student {
    @Id
    private Long studentId;
    @Column(length = 64)
    private String studentName;
    private Boolean studentGender;
    @Column(length = 8)
    private Integer studentAge;
    @Column(length = 64)
    private String studentClass;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "grade",
            joinColumns = {@JoinColumn(name = "studentId", referencedColumnName = "studentId")},
            inverseJoinColumns = {@JoinColumn(name = "courseId", referencedColumnName = "courseId")})
    private List<Course>courses;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Boolean getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(Boolean studentGender) {
        this.studentGender = studentGender;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}