package CS105;

public class Meat extends Food{

    private int quantity;

    public Meat(double tax, double kgs, int quality) {
        super(kgs, tax);
        this.quantity = quality;
    }

}
