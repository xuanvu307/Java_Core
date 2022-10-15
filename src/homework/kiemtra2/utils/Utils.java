package homework.kiemtra2.utils;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    /* Regex format
     * User gồm số,chữ cái thường và in hoa độ dài từ 5-10 ký tự
     * Email bắt đầu bằng chữ thường, có độ dài từ 4-10 ký tự, gồm 1 chữ @ và kết thúc bằng đuôi .com
     * Password gồm số chữ cái và ký tự đặc biệt (.;_*) chứa ít nhất 1 chữ hoa và 1 ký tự đặc biệt
     *          độ dài pass từ 7-15 ký tự
     */

    String regexUserName = "[a-zA-Z0-9]{5,10}";
    String regexMail = "^[a-z][a-zA-Z0-9]{3,9}@{1}[a-zA-Z]+.com$";
    String regexPassword = "(?=.*[A-Z])(?=.*[.;+*])(\\S){7,15}";
    Pattern patternUserName = Pattern.compile(regexUserName);
    Pattern patternMail = Pattern.compile(regexMail);
    Pattern patternPassword = Pattern.compile(regexPassword);

    boolean check = false;
    Scanner sc = new Scanner(System.in);


    //check username

    public String checkUserName() {
        String inputUserName = " ";
        do {
            inputUserName = sc.nextLine();
            Matcher matcher = patternUserName.matcher(inputUserName);
            if (matcher.find()) {
                System.out.println("Username ----> OK\n");
                check = true;
            } else {
                System.out.println("Username Wrong, re-enter name");
                check = false;
            }
        }while (check==false);
        return inputUserName;
    }


    //check email

    public String checkEmail(){
        check = false;
        String inputMail = " ";
        while (check==false){
            inputMail = sc.nextLine();
            Matcher matcher = patternMail.matcher(inputMail);
            if (matcher.find()){
                System.out.println("Username ----> OK\n");
                check =true;
                break;
            } else {
                System.out.println("Email Wrong, re-enter Email");
                check=false;
            }
        }
        return inputMail;
    }

    //check password

    public String checkPassword(){
        check = false;
        String inputPassword= " ";
        while (check==false){
            inputPassword = sc.nextLine();
            Matcher matcher = patternPassword.matcher(inputPassword);
            if (matcher.find()){
                System.out.println("Password ---->OK\n");
                check =true;
            } else {
                System.out.println("Password Wrong, re-enter Password");
                check=false;
            }
        }
        return inputPassword;
    }
}
