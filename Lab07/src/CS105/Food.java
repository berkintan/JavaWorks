package CS105;

public class Food extends Product{

    private double kgs;
    private String expirationDate;

    public Food(double kgs,double tax) {
        super(tax);
        this.kgs = kgs;
        this.expirationDate = "13.11.2022";

    }

    public Food(String name) {
        super(Double.parseDouble(name));
    }
}
