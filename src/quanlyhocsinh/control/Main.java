package quanlyhocsinh.control;

import quanlyhocsinh.model.School;
import quanlyhocsinh.model.SchoolModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<School> schools = new ArrayList<>();
        SchoolModel schoolModel = new SchoolModel();

        // nhập vào số học sinh

        System.out.println("enter number student add");
        int numberStudent = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberStudent; i++){
            System.out.println("\nstudent " +(i+1));
            School school = schoolModel.inputSchool(sc);
            schools.add(school);
        }


        // in ra những ai sinh năm 1985 và quê ở thái nguyên

        int check = 0;
        System.out.println("student is birthday 1985 and address in thai nguyen");
        for (School school: schools){
            if(school.getStudent().getBirthday().getYear()==1985
                    && school.getStudent().getAddress().toLowerCase().equals("thai nguyen")){
                System.out.println(school.getStudent().toString());
                check++;
            }
        }
        if (check == 0){
            System.out.println("no student birthday 1985 and address in thai nguyen");
        }

        //in ra những học sinh học lớp 10A1

        check = 0;
        System.out.println("\nstudent on class 10a1");
        for (School school: schools){
            if (school.getaClass().toLowerCase().equals("10a1")){
                System.out.println(school.toString());
                check++;
            }
        }
        if (check ==0 ){
            System.out.println("no stdent on 10A1");
        }
    }
}
