package quanlylophoc.model;

import lesson5.homework.Utils;

public class Teacher extends User{
    private int yearOfExperiences;
    private String speciality;

    public int getYearOfExperiences() {
        return yearOfExperiences;
    }

    public Teacher(User user, int yearOfExperiences, String speciality) {
        super(user.getId(), user.getName(), user.getGender(), user.getBirthday(), user.getEmail(), user.getPhoneNumber());
        this.yearOfExperiences = yearOfExperiences;
        this.speciality = speciality;
    }

    public void setYearOfExperiences(int yearOfExperiences) {
        this.yearOfExperiences = yearOfExperiences;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Teacher: "+super.toString()+ String.format("year of exp = %d, speciality = %s",yearOfExperiences,speciality);
    }
}
