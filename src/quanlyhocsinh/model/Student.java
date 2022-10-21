package quanlyhocsinh.model;

import java.time.LocalDate;

public class Student {
    private String fullName;
    private LocalDate birthday;
    private String address;


    public Student(String fullName, LocalDate birthday, String address) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
