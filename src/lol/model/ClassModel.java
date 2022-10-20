package lol.model;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassModel {
    StudentModel studentModel = new StudentModel();
    ArrayList<Student> students = new ArrayList<>();

    public Class inputClass(Scanner sc){
        Student student = studentModel.addStudent(sc);
        System.out.println("input subject: ");
        String subject = sc.nextLine();
        sc.nextLine();
        students.add(student);
        Class classA = new Class(subject, students);
        return classA;
    }
}
