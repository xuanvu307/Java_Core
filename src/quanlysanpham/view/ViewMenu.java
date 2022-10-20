package quanlysanpham.view;

import quanlysanpham.model.Product;

import java.util.ArrayList;

public class ViewMenu {

    //trang chủ

    public void homePage(){
        System.out.println("-----> MENU ");
        System.out.println("1. Add product");
        System.out.println("2. View list product ");
        System.out.println("3. Search by name ");
        System.out.println("4. Search by id ");
        System.out.println("5. Search amount < 5 ");
        System.out.println("6. Search by price ");
        System.out.println("0. Exit");
    }

    // in tất cả sản phẩm
    public void viewProduct(ArrayList<Product> products){
        System.out.println(products.toString());
    }


    //menu tìm kiếm theo giá
    public void viewMenuPrice(){
        System.out.println("1. Search price < 50.000");
        System.out.println("2. Search 50.000 <= price < 100.000");
        System.out.println("3. Search price >= 100.000");
    }

    public void viewId(){
        System.out.println("1. Delete");
        System.out.println("2. Update amount");
    }
}
