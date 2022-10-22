package quanlyhocsinh.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StudentModel {
    public Student inputStudent(Scanner sc){
        System.out.println("enter fullnaem");
        String fullName = sc.nextLine();
        System.out.println("birthday");
        String date = sc.nextLine();
        LocalDate birthday = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("address");
        String address = sc.nextLine();
        Student student = new Student(fullName,birthday,address);
        return student;
    }
}
