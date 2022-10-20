package lol.model;

import java.util.ArrayList;

public class Class {
    private String subject;
    private ArrayList<Student> students;

    public Class(String subject, ArrayList<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    public Class() {

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }
}
