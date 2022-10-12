package lesson5.homeWork;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employyee {
    private String id;
    private String name;
    private String birthday;
    private double salary;
    private Utils.GENDER gender;


    public Employyee() {
    }

    public Employyee(String id, String name, String birthday, double salary, Utils.GENDER gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
        this.gender = gender;
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

    public Utils.GENDER getGender() {
        return gender;
    }

    public void setGender(Utils.GENDER gender) {
        this.gender = gender;
    }

    //_________________end geter and setter____________


    @Override
    public String toString() {
        return "Employyee :  " +
                "id = " + id +
                ", FullName = " + name +
                ", Birth Day = " + birthday +
                ", Salary = " + salary +
                "($), Gender : " + gender
                ;
    }

    public String idAndName() {
        return "id = " + id  +
                ", name = " + name
              ;
    }

    public LocalDate convertDay(){
        LocalDate birthdayConvert = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return birthdayConvert;
    }

}
