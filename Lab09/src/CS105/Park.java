package CS105;

public class Park {

    private String parkName;
    private double parkPrice;

    Park(String parkName, double parkPrice) {
        this.parkName = parkName;
        this.parkPrice = parkPrice;
    }
    public double getParkPrice() {
        return this.parkPrice;
    }
}
