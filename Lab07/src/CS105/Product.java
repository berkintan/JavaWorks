package CS105;

public class Product {

    private double tax;
    private double price;
    private String name;

    public Product() {
        this.tax = 18.0;
        this.price = 1;
    }

    public String toString() {
        return this.name;
    }

    public Product(double tax) {
        this.tax = tax;
    }

    public Product(double tax, double price) {
        this.tax = tax;
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
