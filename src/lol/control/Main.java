package lol.control;


import lol.model.ClassModel;
import lol.model.School;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassModel classModel = new ClassModel();

        School school = new School();

        System.out.println(school.toString());
    }
}
