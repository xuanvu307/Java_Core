package quanlysanpham.model;

public class Product {
    private String id;
    private String name;
    private String description;
    private int amount;
    private double price;
    private String unit;


    //----------------begin getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    //----------------end getter and setter

    @Override
    public String toString() {
        return "Product: " +
                "id = " + id  +
                ", name = " + name  +
                ", description = " + description  +
                ", amount = " + amount +
                ", price = " + price +
                ", unit = " + unit  + "\n";
    }
}
