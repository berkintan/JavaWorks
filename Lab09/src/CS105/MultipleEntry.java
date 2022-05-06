package CS105;

import java.util.ArrayList;

public abstract class MultipleEntry extends Ticket {
    private ArrayList<Park> parks;

    public MultipleEntry(int adultCount, int childCount) {
        super(adultCount,childCount);
        this.parks = new ArrayList<Park>();
    }

    public void addPark(String parkName, double parkPrice) {
        this.parks.add(new Park(parkName,parkPrice));
    }

    @Override
    public double calculatePrice() {
        double price = 0.;
        for(Park park : this.parks) {
            price += park.getParkPrice() * (this.getAdultCount() +
                0.5 * this.getChildCount());
        }

        return price;
    }
}
