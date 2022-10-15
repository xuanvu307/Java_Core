package lesson4;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] arr = str.split(" ",1);
        String str1 = "";
        for (int i = 0; i < arr.length; i++){
            str1 += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(str1);
        }
    }
}
