package homework.test;
//in ra 10 số nguyên tố đầu tiên
//in ra snt nhỏ hơn 10
public class Ex4 {
    public static void main(String[] args) {
        int a=1;        //gán a= 1 để thực hiện chạy xét cho các số tự nhiên từ 1 đến khi đủ số lượng yêu câu
        int b=1;        //biến b để đếm số lần được in ra
        // vòng lặp do while chạy biến a vì không biết được số lần lặp của vòng
        //vòng lặp sẽ kết thúc khi số lần in ra của biến b đạt yêu cầu mong muốn
        do {
            boolean check = false;
            if (a==2||a==3) {
                check = true;
            } else {
                for (int i=2;i <= Math.sqrt(a);i++){
                    if (a%i==0){
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }
            }
            if (check == true){
                System.out.println("prime number " + b + " = " +a);
                b++;
            }
            a++;
        } while (b<=10);
        //thực hiện in ra số nguyên tố nhỏ hơn 10
        // sẽ cho biến a bắt đầu chạy từ 1 và sẽ kết thúc khi a <10
        a = 1;
        System.out.print("************\nprime number < 10: ");
        do {
            boolean check = false;
            if (a == 2 || a == 3) {
                check = true;
            } else {
                for (int i = 2; i <= Math.sqrt(a); i++) {
                    if (a % i == 0) {
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }
            }
            if (check == true) {
                System.out.print(a + "\t");
            }
            a++;
        }while (a<10);
        System.out.println("\n************");
    }
}

