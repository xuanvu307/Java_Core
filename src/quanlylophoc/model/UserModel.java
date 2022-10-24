package quanlylophoc.model;

import lesson5.homework.Utils;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class UserModel {

    public User creatUser(Scanner sc){
        User user = new User();
        System.out.println("id:");
        user.setId(sc.nextLine());
        System.out.println("name: ");
        user.setName(sc.nextLine());
        System.out.println("gender: \n 1. MALE\n 2. FEMALE");
        int chooseNumber = sc.nextInt();
        switch (chooseNumber){
            case 1:
                user.setGender(Utils.GENDER.MALE);
                break;
            case 2:
                user.setGender(Utils.GENDER.FEMALE);
                break;
        }
        System.out.println("birthday(dd/MM/yyyy): ");
        sc.nextLine();
        String date = sc.nextLine();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthday = LocalDate.parse(date, df);
        user.setBirthday(birthday);

        System.out.println("email: ");
        user.setEmail(sc.nextLine());
        System.out.println("phone number: ");
        user.setPhoneNumber(sc.nextLine());
        return user;
    }


    // Tìm kiếm theo keyword bất kỳ nếu xuất hiện trong tên hoặc email hoặc số điện thoại thì in ra thông tin người đó

    public void search(ArrayList<User> users,Scanner sc){
        int check = 0;
        System.out.println("Key search ");
        String keySearch = sc.nextLine();
        for (User user: users){
            if (user.getName().toLowerCase().equals(keySearch.toLowerCase())
                || user.getEmail().toLowerCase().equals(keySearch.toLowerCase())
                    || user.getPhoneNumber().toLowerCase().equals(keySearch.toLowerCase())){

                check++;
                System.out.println(user.toString());
            }
        }
        if (check == 0){
            System.out.println("no result");
        }
    }

    // sắp xếp theo tên

    public void sortByName(ArrayList<User> users){
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getName().compareTo(u2.getName());
            }
        });
    }

    // sắp xếp theo tuổi giảm dần
    public void sortByAge(ArrayList<User> users){
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                if (u1.getBirthday().getYear() > u2.getBirthday().getYear()){
                    return 1;
                } else if (u1.getBirthday().getYear() == u2.getBirthday().getYear()){
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }

}
