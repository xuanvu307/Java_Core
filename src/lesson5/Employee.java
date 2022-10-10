package lesson5;

import java.util.Scanner;

public class Employee extends Person {
    private double exp;
    private String placeWork;
    Scanner sc = new Scanner(System.in);

    public Employee() {
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    @Override
    public String toString() {
        return ", exp= " + exp +
                ", placeWork= " + placeWork +
                "}";
    }

    public void displayEmployee (){
        System.out.println(super.toString()+toString());
    }
    public void setPerson() {
        System.out.println("id");
        setId(sc.nextInt());
        System.out.println("age");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("name");
        setName(sc.nextLine());
        System.out.println("address");
        setAddress(sc.nextLine());
        System.out.println("exp");
        setExp(sc.nextInt());
        System.out.println("place work");
        sc.nextLine();
        setPlaceWork(sc.nextLine());
    }
}
