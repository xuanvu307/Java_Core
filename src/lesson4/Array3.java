package lesson4;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number row matrix A");
        int numberRowMatrixA = sc.nextInt();
        System.out.println("number colum matrix A");
        int numberColumMatrixA = sc.nextInt();
        System.out.println("number row matrix B");
        int numberRowMatrixB = sc.nextInt();
        System.out.println("number colum matrix B");
        int numberColumMatrixB = sc.nextInt();
        int [][] matrixA = new int[numberRowMatrixA][numberColumMatrixA];
        int [][] matrixB = new int[numberRowMatrixB][numberColumMatrixB];
        int [][] matrixC = new int[numberRowMatrixB][numberColumMatrixB];
        if ((numberColumMatrixB != numberColumMatrixA) || (numberRowMatrixA != numberRowMatrixB)) {
            System.out.println("No program");
        } else {
            for (int i=0; i < numberRowMatrixA; i++){
                for (int j=0; j< numberColumMatrixA; j++){
                    System.out.println("number A[" +i+"]["+j +"] = ");
                    matrixA[i][j] = sc.nextInt();
                }
            }
            for (int m=0; m < numberRowMatrixB; m++){
                for (int n=0; n< numberColumMatrixB; n++){
                    System.out.println("number B[" +m+"]["+n +"] = ");
                    matrixB[m][n] = sc.nextInt();
                }
            }

            for (int i=0; i < numberRowMatrixA; i++){
                for (int j=0; j< numberColumMatrixA; j++){
                    for (int m=0; m < numberRowMatrixB; m++){
                        for (int n=0; n< numberColumMatrixB; n++){
                            if (i == m && j == n){
                                matrixC[i][j]= matrixA[i][j]+ matrixB[m][n];
                            }
                        }
                    }
                }
            }
            System.out.println("Matrix A");
            for (int i=0; i < numberRowMatrixA; i++){
                for (int j = 0; j<numberColumMatrixA;j++){
                    System.out.print(matrixA[i][j]+ "\t");
                }
                System.out.println("");
            }
            System.out.println("Matrix B");
            for (int m = 0; m < numberRowMatrixB; m++){
                for (int n = 0; n<numberColumMatrixB;n++){
                    System.out.print(matrixB[m][n] +"\t");
                }
                System.out.println("");
            }
            System.out.println("Matrix C= Matrix A + Matrix B");
            for (int i=0; i < numberRowMatrixB; i++){
                for (int j = 0; j<numberColumMatrixB;j++){
                    System.out.print(matrixC[i][j] +"\t");
                }
                System.out.println("");
            }
        }
    }
}
