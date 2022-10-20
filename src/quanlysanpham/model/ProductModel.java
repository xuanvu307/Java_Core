package quanlysanpham.model;


import quanlysanpham.view.ViewMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductModel {
    ViewMenu viewMenu = new ViewMenu();

    // khởi tạo nhập các sản phẩm

    public Product inputProduct(ArrayList<Product> products,Scanner sc){
        Product product = new Product();
        System.out.println("id: ");
        product.setId(sc.nextLine());
        System.out.println("name: ");
        product.setName(sc.nextLine());
        System.out.println("description");
        product.setDescription(sc.nextLine());
        System.out.println("amount: ");
        product.setAmount(sc.nextInt());
        System.out.println("price: ");
        product.setPrice(sc.nextDouble());
        sc.nextLine();
        System.out.println("unit: ");
        product.setUnit(sc.nextLine());
        products.add(product);
        return product;
    }

    // Tìm sản phẩm theo tên

    public void searchByName(Scanner sc,ArrayList<Product> products){
        System.out.println("input key search");
        String keySearch = sc.nextLine();
        for (Product product: products){
            if(product.getName().toLowerCase().equals(keySearch.toLowerCase())){
                System.out.println(product.toString());
            }
        }
    }

    // Tìm sản phẩm có số lượng nhỏ hơn 5

    public void searchByAmount(Scanner sc, ArrayList<Product> products){
        for (Product product: products){
            if(product.getAmount() < 5 ){
                System.out.println(product.toString());
            }
        }
    }

    // tìm sản phẩm theo id

    public void searchById(Scanner sc,ArrayList<Product> products){
        System.out.println("input key search");
        String keySearch = sc.nextLine();
        for (Product product: products){
            if(product.getId().equals(keySearch)){
                System.out.println(product.toString());
                viewMenu.viewId();
                int choose = sc.nextInt();
                switch (choose){
                    case 1:
                        products.remove(product);
                        break;
                    case 2:
                        System.out.println("new amount");
                        int amount = sc.nextInt();
                        product.setAmount(amount);
                        break;
                }
                break;
            }
        }

    }

    //tìm dản phẩm có giá dưới 50.000

    public void searchByPriceLow(Scanner sc, ArrayList<Product> products){
        int numberCheck = 0;
        for (Product product: products){
            if(product.getPrice() < 50000.0 ){
                System.out.println(product.toString());
                numberCheck++;
            }
        }
        if (numberCheck == 0 ){
            System.out.println("no product\n");
        }
    }

    // tìm sản phẩm có giá Từ 50.000 đến dưới 100.000

    public void searchByPrice(Scanner sc, ArrayList<Product> products){
        int numberCheck = 0;
        for (Product product: products){
            if(product.getPrice() >= 50000.0 && product.getPrice() < 100000.0){
                System.out.println(product.toString());
                numberCheck++;
            }
        }
        if (numberCheck == 0 ){
            System.out.println("no product\n");
        }
    }

    //tìm dản phẩm có giá trên 100.000

    public void searchByPriceHigh(Scanner sc, ArrayList<Product> products){
        int numberCheck = 0;
        for (Product product: products){
            if(product.getPrice() >= 100000.0){
                System.out.println(product.toString());
                numberCheck++;
            }
        }
        if (numberCheck == 0 ){
            System.out.println("no product\n");
        }
    }

}
