package forloop;

import java.util.Scanner;

//tìm ước chung lớn nhất và bội chung nhỏ nhất theo thuật toán ơ-clit
// số lớn % số nhỏ đến khi nào chi hết thì số nhỏ là ucln
//khi có ucln thì bcnn = a*b/ucln

public class UCLN_BCNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        int ucln = 1;
        if (a == 0 || b == 0 ){
            System.out.println("UCLN(a,b) = " +(ucln = a+b));
        } else {
            do {
                if (a>b){
                    int c = a%b;
                    if (c==0){
                        ucln = b;
                        break;
                    } else {
                        a=c;
                    }
                } else {
                    int c =b%a;
                    if (c==0){
                        ucln = a;
                        break;
                    } else {
                        b=c;
                    }
                }
            } while (a%b!=0||b%a !=0);
            System.out.println("ucln " +ucln);

            // nếu 2 số có ucln là 1 thì 2 số là số nguyên tố

            if (ucln == 1) {
                System.out.println("a and b the prime number");
            }

        }

    }
}
