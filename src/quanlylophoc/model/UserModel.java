package quanlylophoc.model;

import lesson5.homework.Utils;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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

    public void search(ArrayList<User> users,Scanner sc){
        System.out.println("Key search ");
        String keySearch = sc.nextLine();
        for (User user: users){
            if (user.getName().toLowerCase().equals(keySearch.toLowerCase())
                || user.getEmail().toLowerCase().equals(keySearch.toLowerCase())
                    || user.getPhoneNumber().toLowerCase().equals(keySearch.toLowerCase())){

                System.out.println(user.toString());
            }
        }
    }
    public void sortByName(){

    }

    public void sortByAge(){

    }

}
