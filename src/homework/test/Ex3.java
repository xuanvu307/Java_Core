package homework.test;
//Bài tập về kiểm tra số nguyên tố
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        //Thực hiện sinh ra số ngẫu nhiên trong tập số nguyên (có thể giới hạn phần từ vào rd.nextInt)
        //Có thể thực hiện bằng lớp Math.random và thực hiện nhân với khoảng giá trị mong muốn

        Random rd = new Random();
        int rdNumber =rd.nextInt();

        //thực hiện kiểm tra số sinh ra phải số nguyên tố không
        //số nguyên tố là số lớn hơn 1 và chỉ chia hết cho 1 và chính nó

        int sqrtRdNumber = (int)Math.sqrt(rdNumber);    //lấy phần nguyên của căn bậc 2 số cần kiểm tra
        if (rdNumber == 1){
            System.out.println(rdNumber+" not prime number");
        } else if (rdNumber == 2 || rdNumber ==3) {
            System.out.println(rdNumber+" prime number");
        } else {
            boolean Check = false;
            for (int i = 2; i <= sqrtRdNumber; i++){        //sử dụng 1 số check mặc định là false không phải số nguyên tố
                if (rdNumber%i ==0){                        //thực hiện chạy check từ 2 đến căn bậc 2 của số tạo ra
                    Check = false;                          //nếu số random chia hết cho 1 số bất kỳ thì gán check = false và kết thúc
                    break;                                  //nếu không có số nào chia hết thì gán true và kết thúc chương trình
                } else {                                    // phải chạy từ 2 vì nếu chạy từ 1 thì số nào cũng chia hết cho 1 => check = false
                    Check =true;                            //gán luôn giá trị cho 2 và 3 nó vì nếu chạy sẽ sinh ra sqrt(3) < i nên không check được giá trị
                }
            }
            if (Check ==true){
                System.out.println(rdNumber + " prime number");
            } else {
                System.out.println(rdNumber + " not prime number");
            }
        }
    }
}
