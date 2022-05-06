package CS105;

public class Cloth extends Product {

    private String brand;
    private String color;
    private int quantity;

    public Cloth(double tax, String color, String brand) {

        super(tax);
        this.color = color;
        this.brand = brand;
    }
}
