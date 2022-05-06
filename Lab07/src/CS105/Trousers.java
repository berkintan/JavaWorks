package CS105;

public class Trousers extends Cloth{

    public Trousers(double tax, String color, String brand) {
        super(tax, color, brand);

    }

    public String toString() {
        return super.toString() + super.getName();
    }
}
