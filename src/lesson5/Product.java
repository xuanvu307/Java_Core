package lesson5;


public class Product {
    private int id;
    private String name;
    private int price;

    public double vat() {
        double vat = price * 0.1;
        return vat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


