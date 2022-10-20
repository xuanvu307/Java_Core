package homework.kiemtra2;

import homework.kiemtra2.model.UserModel;
import homework.kiemtra2.view.MenuView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserModel userModel = new UserModel();
        MenuView view = new MenuView();

        int chooseNumber = 0;
        do {
            view.homePage();
            chooseNumber = sc.nextInt();
            switch (chooseNumber){
                case 1:
                    userModel.register();
                    break;
                case 2:
                    sc.nextLine();
                    userModel.login();
                    break;
                case 3:
                    userModel.check();
            }
        }while (chooseNumber !=0);
    }
}
