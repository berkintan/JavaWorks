package CS105;

public class Main {

    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelarate(30);
        outlander.accelarate(20);
        outlander.accelarate(-42);
    }
}
