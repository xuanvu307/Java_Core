package quanlysanpham.control;

import quanlysanpham.model.Product;
import quanlysanpham.model.ProductModel;
import quanlysanpham.view.ViewMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        ProductModel productModel = new ProductModel();
        ViewMenu menuView = new ViewMenu();
        int chooseNumber;
        do {
            menuView.homePage();
            chooseNumber = sc.nextInt();
            sc.nextLine();
            switch (chooseNumber){
                case 1:
                    productModel.inputProduct(products,sc);
                    break;
                case 2:
                    menuView.viewProduct(products);
                    break;
                case 3:
                    productModel.searchByName(sc,products);
                    break;
                case 4:
                    productModel.searchById(sc,products);
                    break;
                case 5:
                    productModel.searchByAmount(sc,products);
                    break;
                case 6:
                    int choose;
                    menuView.viewMenuPrice();
                    choose = sc.nextInt();
                    switch (choose){
                        case 1:
                            productModel.searchByPriceLow(sc,products);
                            break;
                        case 2:
                            productModel.searchByPrice(sc,products);
                            break;
                        case 3:
                            productModel.searchByPriceHigh(sc,products);
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
        }while (chooseNumber != 0);
    }
}
