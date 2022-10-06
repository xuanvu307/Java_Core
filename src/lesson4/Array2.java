package lesson4;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number row");
        int rowNumber = sc.nextInt();
        System.out.println("Number colum");
        int columNumber = sc.nextInt();
        int [][] array = new int[rowNumber][columNumber];
        for (int i=0; i < rowNumber; i++){
            for (int j=0; j< columNumber; j++){
                System.out.println("Aray["+(i+1)+"]["+(j+1) +"]");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i < rowNumber; i++){
            for (int j=0; j< columNumber; j++){
                System.out.print(+array[i][j] +"\t");
            }
            System.out.println("\n");
        }
        int sum =0;
        for (int i=0; i < rowNumber; i++){
            for (int j=0; j< columNumber; j++){
                sum += array[i][j];
            }
        }
        System.out.println("sum all number = " +sum);
        sum =0;
        for (int i=0; i < rowNumber; i++){
            for (int j=0; j< columNumber; j++){
                if (array[i][j]%3==0){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("sum number array%3=0 = " +sum);
    }
}
