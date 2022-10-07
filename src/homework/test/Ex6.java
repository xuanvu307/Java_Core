package homework.test;
//kiểm tra chuỗi nhập vào có phải số điện thoại hay email không?
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check;
        String email, phone;

        // điều kiện email đúng là:
        // + bắt đầu bằng chữ cái, chỉ chứa các chữ cái hoặc số, độ dài từ 4 - 16 ký tự
        // + chứa và chỉ chứa 1 ký tự @, sau email chỉ có chữ
        // + kết thúc bằng đuôi .com
        // nếu người dùng nhập sai hỏi người dùng có tiếp tục nhập hay không?

        String regexMail = "^[a-zA-Z][\\w]{3,15}@{1}[a-zA-Z]+.com$";

        do {
            System.out.println("your email format xxxx@hotmail.com");
            email = sc.nextLine();
            Pattern pattern = Pattern.compile(regexMail);
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                System.out.println("email OK");
                check =true;
            } else {
                System.out.println("email entered the wrong format , try again : y/n ");
                String checkValue = sc.nextLine();
                if (checkValue.equals("y")|| checkValue.equals("Y")){
                    check =false;
                } else {
                    check = true;
                }
            }
        }while (check==false);

        //điều kiện đúng của số điện thoại:
        // + bắt đầu bằng số 0
        // + có 10 chữ số
        // nếu người dùng nhập sai hỏi người dùng có nhập tiếp hay không?

        String regexPhone = "^[0][0-9]{9}";
        do {
            System.out.println("your phone format 0xxxxxx ");
            phone = sc.nextLine();
            Pattern pattern = Pattern.compile(regexPhone);
            Matcher matcher = pattern.matcher(phone);
            if (matcher.find()) {
                System.out.println("number phone OK");
                check = true;
            } else {
                System.out.println("number phone false, try again : y/n");
                String checkValue = sc.nextLine();
                if (checkValue.equals("y")|| checkValue.equals("Y")){
                    check =false;
                } else {
                    check = true;
                }
            }
        } while (check ==false);

        // thực hiện in kết quả

        System.out.println(email + "\t ---email--- " +Pattern.matches(regexMail,email));
        System.out.println(phone + "\t ---number phone--- " +Pattern.matches(regexPhone,phone));
    }
}
