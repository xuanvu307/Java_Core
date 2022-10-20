package quanlylophoc.model;

import lesson5.homework.Utils;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class User {
    private String id;
    private String name;
    private Utils.GENDER gender;
    private LocalDate birthday;
    private String email;
    private String phoneNumber;


    public User(String id, String name, Utils.GENDER gender, LocalDate birthday, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User() {

    }

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

    public Utils.GENDER getGender() {
        return gender;
    }

    public void setGender(Utils.GENDER gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("id = %s, name = %s, gender = %s, birthday = %td-%tm-%tY, email = %s, phoneNumber = %s,",id,name,gender,birthday,email,phoneNumber);
    }
}
