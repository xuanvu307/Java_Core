package lesson5.homeWork;



import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employyee employyee = new Employyee();
        LocalDate localDate = LocalDate.now();


        Employyee nguyenVanA = new Employyee("NV01","Nguyễn Văn A", "10/11/1999",1000, Utils.GENDER.MALE);
        Employyee tranThiB = new Employyee("NV02","Trần Thị B", "20/10/1980",1230, Utils.GENDER.FEMALE);
        Employyee hoangVanC = new Employyee("NV03","Hoàng Văn C", "02/01/2005",890, Utils.GENDER.MALE);
        Employyee nguyenThiD = new Employyee("NV04","Nguyễn Thị D", "16/02/2000",1504, Utils.GENDER.FEMALE);
        Employyee leThiD = new Employyee("NV05","Lê Thị D", "10/09/1996",1300, Utils.GENDER.FEMALE);

        Employyee [] array = {nguyenVanA,tranThiB,hoangVanC,nguyenThiD,leThiD};

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i <array.length; i++){
            if ((LocalDate.now().getYear() - 30) > array[i].convertDay().getYear()){
                System.out.println(array[i]);
            }
        }

        for (int i = 0; i <array.length; i++){
            if (array[i].getGender().equals(Utils.GENDER.MALE)){
                sum1 += 1;
            } else {
                sum2 +=1;
            }
        }
        System.out.println("nv nam " +sum1);
        System.out.println("nv nũ " +sum2);


        System.out.println("nhập tháng");



//        for (int i = 0; i <array.length-1; i++){
//            for (int j = 1; j <array.length; i++){
//                if (array[i].getSalary()< array[j].getSalary()){
//                    tg = array[i].getSalary();
//                    array[i].getSalary() = array[j].getSalary();
//                    array[j].getSalary() = tg;
//                }
//            }
//        }


//        System.out.println(nguyenVanA.convertDay());

    }
}
