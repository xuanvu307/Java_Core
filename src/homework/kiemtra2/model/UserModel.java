package homework.kiemtra2.model;

import homework.kiemtra2.utils.Utils;
import homework.kiemtra2.view.MenuView;

import java.util.ArrayList;
import java.util.Scanner;


public class UserModel {

    Scanner sc = new Scanner(System.in);
    Utils utils = new Utils();
    ArrayList<User> users = new ArrayList<>();
    MenuView view = new MenuView();

    /* Đăng ký
     * điền thông tin và check regex
     * điền đủ thông tin check email và user trong list
     */

    public User register(){

        User user = new User();
        System.out.println("========REGISTER========");
        System.out.println("User name: ");
        user.setUserName(utils.checkUserName());
        System.out.println("Email : ");
        user.setEmail(utils.checkEmail());
        System.out.println("Password : ");
        user.setPassword(utils.checkPassword());
        if (users.size() == 0){
            System.out.println("register --> OK");
            users.add(user);
        } else {
            int check = 0;
            for (int i = 0; i < users.size(); i++){
                if (user.getUserName().equals(users.get(i).getUserName())
                        ||user.getEmail().equals(users.get(i).getEmail())){
                    System.out.println("Email or Username fail ");
                    check = 1;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("register --> OK");
                users.add(user);
            }
        }
        return user;
    }

    //đăng nhập

    public void login() {
        System.out.println("==========LOGIN===========");
        System.out.println("User Name: ");
        String checkUserName = sc.nextLine();
        System.out.println("Password: ");
        String checkPassword = sc.nextLine();
        if (users.size() == 0) {
            System.out.println("login fail");
        }
        int m = 0;
        int n = 0;
        for (int i = 0; i < users.size(); i++) {
            if ((checkUserName.equals(users.get(i).getUserName()))
                    && (checkPassword.equals(users.get(i).getPassword()))) {
                System.out.println("HELLO: " + users.get(i).getUserName());
                view.loginSuccess();
                m++;
                switch (sc.nextInt()) {
                    case 1:
                        users.get(i).setUserName(reUserName());
                        break;
                    case 2:
                        users.get(i).setEmail(reEmail());
                        break;
                    case 3:
                        users.get(i).setPassword(rePassword());
                        break;
                    case 4:
                        login();
                        break;
                    case 0:
                        break;
                    }
                }
            if (m==0){
                if ((users.get(i).getUserName()).equals(checkUserName)) {
                    view.loginFail();
                    n++;
                    switch (sc.nextInt()) {
                        case 1:
                            sc.nextLine();
                            login();
                            break;
                        case 2:
                            sc.nextLine();
                            forgotPassword();
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        if (m ==0 && n == 0) {
            view.userFail();
            switch (sc.nextInt()) {
                case 1:
                    sc.nextLine();
                    login();
                    break;
                default:
                    break;
            }

        }

    }


    /* quên mật khẩu
     * điền e mail và tìm email trong list
     * nếu thấy email thì gọi mật khẩu ra và set lại mật khẩu mới
     * nếu không thấy email thoát chương trình
     */

    public String forgotPassword(){
        int check = 0;
        System.out.println("enter email: ");
        for (int i = 0; i < users.size(); i++){
            if (users.get(i).getEmail().equals(sc.nextLine())) {
                System.out.println("new password: ");
                String newPassword = utils.checkPassword();
                users.get(i).setPassword(newPassword);
                System.out.println(" set new password success : " + users.get(i).getPassword());
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("Email wrong");
        }
        return "newPassword";
    }

    /* sửa user name
     *sửa email
     * sửa password
     */
    public String reUserName(){
        boolean check =false;
        String newName= "";
        while (check==false){
            System.out.println("enter new user name");
            int sumCheck =0;
            newName = utils.checkUserName();
            for (int i = 0; i < users.size(); i++){
                if (users.get(i).getUserName().equals(newName)) {
                    System.out.println("re user name false, user name used");
                    sumCheck ++;
                    check = false;
                }
            }
            if (sumCheck == 0){
                System.out.println("new user name ok");
                check = true;
            }
        }
        return newName;
    }

    public String reEmail(){
        boolean check =false;
        String newEmail = " ";
        while (check == false) {
            System.out.println("enter new email");
            int sumCheck = 0;
            newEmail = utils.checkEmail();
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getEmail().equals(newEmail)) {
                    System.out.println("re email false, email is used");
                    sumCheck++;
                    check = false;
                }
            }
            if (sumCheck == 0){
                System.out.println("new email OK");
                check = true;
            }
        }
        return newEmail;
    }

    public String rePassword(){

        System.out.println("enter new password");
        String newPassword = utils.checkPassword();

        return newPassword;
    }

}
