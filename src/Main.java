import lesson5.Employee;
import lesson5.Person;
import lesson5.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        //bài 1

//        System.out.println("enter number tax");
//        int price = sc.nextInt();
//        product.setPrice(price);
//        System.out.println(product.vat() + " $");

        //bài 2

        employee.setPerson();
        employee.displayEmployee();

    }
}
