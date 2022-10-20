package quanlylophoc.model;

import lesson5.homework.Utils;

public class Student extends User{
    private boolean isOnline;
    private String background;


    public Student(User user, boolean isOnline, String background) {
        super(user.getId(), user.getName(), user.getGender(), user.getBirthday(), user.getEmail(), user.getPhoneNumber());
        this.isOnline = isOnline;
        this.background = background;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public String toString() {
        return "Student : "+super.toString() +
                ", isOnline = " + isOnline +
                ", background = " + background +"\n";
    }
}
