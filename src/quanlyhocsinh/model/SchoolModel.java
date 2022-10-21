package quanlyhocsinh.model;


import java.util.Scanner;

public class SchoolModel {
    StudentModel studentModel = new StudentModel();

    public School inputSchool(Scanner sc){
        System.out.println("input Class");
        String aClass = sc.nextLine();
        System.out.println("input course");
        String course = sc.nextLine();
        System.out.println("input semester");
        String semester = sc.nextLine();
        Student student = studentModel.inputStudent(sc);
        School school = new School(aClass,course,semester,student);
        return school;
    }
}
