package CS105;

public abstract class Ticket {
    private int adultCount;
    private int childCount;

    public Ticket(int adultCount, int childCount) {
        this.adultCount = adultCount;
        this.childCount = childCount;
    }

    public abstract double calculatePrice();

    protected int getAdultCount() {
        return this.adultCount;
    }

    protected int getChildCount() {
        return this.childCount;
    }

    }

