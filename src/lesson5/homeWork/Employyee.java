package lesson5.homeWork;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employyee {
    private String id;
    private String name;
    private String birthday;
    private double salary;
    public enum gender {
        MALE, FEMALE
    }

    public Employyee() {
    }

    public Employyee(String id, String name, String birthday, double salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    //__________________bigin getter and setter___________


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //_________________end geter and setter____________


    @Override
    public String toString() {
        return "id = " + id +
                ", name = " + name  +
                ", birthday = " + birthday +
                ", salary = " + salary;
    }

    Scanner sc = new Scanner(System.in);

    public void add(){
        System.out.println("input id");
        id = sc.nextLine();
        System.out.println("input name");
        name = sc.nextLine();
        System.out.println("inut bỉhdat");
        birthday = sc.nextLine();
        System.out.println("input salary");
        salary = sc.nextDouble();
        System.out.println("input gander");
        gender male = gender.MALE;
        gender female = gender.FEMALE;
    }

    public LocalDate convertDay(){
        LocalDate birthdayConvert = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return birthdayConvert;
    }

}
