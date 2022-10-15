package homework.kiemtra2.view;


public class MenuView {
    public void homePage(){
        System.out.println("*********** MENU **********");
        System.out.println("*                         *");
        System.out.println("*       1. Register       *");
        System.out.println("*        2. Login         *");
        System.out.println("*                         *");
        System.out.println("***************************");
    }
    public void loginFail(){
        System.out.println("***** PASSWORD  WRONG *****");
        System.out.println("*                         *");
        System.out.println("*     1. Retry Login      *");
        System.out.println("*   2. Forgot password    *");
        System.out.println("*                         *");
        System.out.println("***************************");
    }
    public void userFail(){
        System.out.println("******* USER  WRONG *******");
        System.out.println("*                         *");
        System.out.println("*        Login fail       *");
        System.out.println("*      1. Retry Login     *");
        System.out.println("*       0. Home page      *");
        System.out.println("*                         *");
        System.out.println("***************************");
    }
    public void loginSuccess(){
        System.out.println("        --> MENU **********");
        System.out.println("*                         *");
        System.out.println("*      1. re-username     *");
        System.out.println("*      2. re-email        *");
        System.out.println("*      3.re-password      *");
        System.out.println("*      4. log out         *");
        System.out.println("*                         *");
        System.out.println("*      0. Home Page       *");
        System.out.println("***************************");
    }
}
