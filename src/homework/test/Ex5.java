package homework.test;
//Ma trận
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //tiến hành khai báo mảng và nhập các phần tử cho mảng

        System.out.println("number row matrix A");
        int numberRowMatrixA = sc.nextInt();
        System.out.println("number colum matrix A");
        int numberColumMatrixA = sc.nextInt();
        int [][] matrixA = new int[numberRowMatrixA][numberColumMatrixA];

        for (int i =0; i < numberRowMatrixA; i++){
            for (int j= 0; j< numberColumMatrixA; j++){
                System.out.println("input number to A[" +i+"]["+j+"]");
                matrixA[i][j] = sc.nextInt();
            }
        }

        //Tiến hành in mảng

        System.out.println("\nmatrix A: \n");
        for (int i =0; i < numberRowMatrixA; i++){
            for (int j= 0; j< numberColumMatrixA; j++){
                System.out.print(matrixA[i][j] +"\t");
            }
            System.out.println("");
        }

        //Liệt kê các phần tử nằm trên đường chéo
        // nếu ma trận vuông thì có 2 đường chéo nhau
        // nếu hàng khác cột thông báo không xác định được đường chéo

        System.out.println("\ndiagonal line");
        if (numberColumMatrixA != numberRowMatrixA){
            System.out.println("\nUknown");
        } else {
            for (int i =0; i < numberRowMatrixA; i++){
                for (int j= 0; j< numberColumMatrixA; j++){
                    if (i==j||(i+j)==(numberRowMatrixA -1)){
                        System.out.println("A[" +i+ "]["+j+"] = " +matrixA[i][j]);
                    }
                }
            }
        }

        //thêm 1 mảng mới cùng hàng cùng cột và thực hiện cộng mảng
        // C[i][j] = A[i][j]+B[i]
        //in ra các mảng A B C

        int [][] matrixB = new int[numberRowMatrixA][numberColumMatrixA];
        int [][] matrixC = new int[numberRowMatrixA][numberColumMatrixA];
        for (int i =0; i < numberRowMatrixA; i++){
            for (int j= 0; j< numberColumMatrixA; j++){
                System.out.println("input number to B[" +i+"]["+j+"]");
                matrixB[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i < numberRowMatrixA; i++){
            for (int j=0; j< numberColumMatrixA; j++){
                for (int m=0; m < numberRowMatrixA; m++){
                    for (int n=0; n< numberColumMatrixA; n++){
                        if (i == m && j == n){
                            matrixC[i][j]= matrixA[i][j]+ matrixB[m][n];
                        }
                    }
                }
            }
        }
        System.out.println("\nMatrix A");
        for (int i=0; i < numberRowMatrixA; i++){
            for (int j = 0; j<numberColumMatrixA;j++){
                System.out.print(matrixA[i][j]+ "\t");
            }
            System.out.println("");
        }
        System.out.println("\nMatrix B");
        for (int m = 0; m < numberRowMatrixA; m++){
            for (int n = 0; n<numberColumMatrixA;n++){
                System.out.print(matrixB[m][n] +"\t");
            }
            System.out.println("");
        }
        System.out.println("\nMatrix C= Matrix A + Matrix B");
        for (int i=0; i < numberRowMatrixA; i++){
            for (int j = 0; j<numberColumMatrixA;j++){
                System.out.print(matrixC[i][j] +"\t");
            }
            System.out.println("");
        }
    }
}
