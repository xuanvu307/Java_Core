package quanlyhocsinh.model;

import java.util.ArrayList;

public class School {
    private String aClass;
    private String course;
    private String semester;
    private Student student;


    public School() {
    }

    public School(String aClass, String course, String semester, Student student) {
        this.aClass = aClass;
        this.course = course;
        this.semester = semester;
        this.student = student;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "School{" +
                "aClass='" + aClass + '\'' +
                ", course='" + course + '\'' +
                ", semester='" + semester + '\'' +
                ", " +student +
                '}';
    }
}
