package quanlylophoc.model;

import lesson5.homework.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
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
        }
        System.out.println("birthday(dd/MM/yyyy): ");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            sc.nextLine();
            Date birthday = df.parse(sc.nextLine());
            df.format(birthday);
        } catch (ParseException e) {
        }

        System.out.println("email: ");
        user.setEmail(sc.nextLine());
        System.out.println("phone number: ");
        user.setPhoneNumber(sc.nextLine());
        return user;
    }

}
