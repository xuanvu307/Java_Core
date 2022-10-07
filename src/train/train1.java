package train;

import java.util.Scanner;

public class train1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i=1; i<= h; i++){
            for (int j= 1; j < 2*h ; j++){
                int x= Math.abs(j-h);           //lấy giá trị dương (0-h)
                int output =i-x;
                if (output>0){
                    System.out.printf(" %d ",output);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }

    }
}
