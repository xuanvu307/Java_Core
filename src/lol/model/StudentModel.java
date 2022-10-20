package lol.model;

import java.util.Scanner;

public class StudentModel {
    public Student addStudent(Scanner sc){
        Student student = new Student();
        System.out.println("id");
        student.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("name");
        student.setName(sc.nextLine());
        System.out.println("Age");
        student.setAge(sc.nextInt());
        System.out.println("mark");
        student.setMark(sc.nextDouble());
        return student;
    }
}
