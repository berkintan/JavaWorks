package CS105;

public class Skirt extends Cloth{

    private String name;
    private double tax;

    public Skirt(int quantity, String brand, String color, double tax, String name) {

        super(quantity,brand,color);
        this.name = name;
        this.tax = tax;
    }
}
