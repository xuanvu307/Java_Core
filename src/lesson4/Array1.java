package lesson4;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input max number array");
        int nArray = sc.nextInt();
        int [] array = new int[nArray];
        for (int i =0 ; i < nArray; i++ ) {
            System.out.println("Number " +(i+1));
            array[i] = sc.nextInt();
        }
        for (int i= 0; i < nArray; i++){
            System.out.print(array[i] +"\t");
        }
        System.out.println("\nplus(1) to even number");
        for (int i=0; i<array.length; i++){
            if(array[i]%2==0){
                array[i] +=1;
            }
        }
        for (int i = 0; i <array.length; i++){
            System.out.print(array[i] +"\t");
        }
    }
}
