package forloop;

public class Fibocacci {
    public static void main(String[] args) {
        int n= 3;
        int fibo=0;
        int a=0;
        int b=1;
        if ( n==1) {
            System.out.println("fibo 1 = 0");
        }else if(n==2){
            System.out.println("fibo 1 = 0");
            System.out.println("fibo 2 = 1");
        }else {
            System.out.println("fibo 1 = 0");
            System.out.println("fibo 2 = 1" );
            for (int i = 2; i < n; i++) {
                fibo = a + b;
                a = b;
                b = fibo;
                System.out.println("fibo " +(i+1) + " = " + fibo);
            }
        }

    }
}
