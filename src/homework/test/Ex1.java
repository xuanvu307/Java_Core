package homework.test;
//In ra màn hình hình tam giác và hình chữ nhật
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("print rectangle");
        for (int i=1 ; i<5; i++){
            for (int j = 1; j<5 ;j++){
                System.out.print("* \t");
            }
            System.out.println(" ");
        }
        System.out.println("print triangle");
        for (int i=1 ; i<5; i++){
            for (int j = 1; j<5 ;j++){
                if (i<j){                  // thêm điều kiện để chỉ in ra các ký tự * khi thỏa mãn
                    break;                 // khi không thỏa mãn thì sẽ bỏ qua vòng lặp và không in *
                }
                System.out.print("* \t");
            }
            System.out.println("");
        }
    }
}
