package Products;

public class Trucks extends Product{

    private int numberOfWheels;

    public Trucks(String productName, int id, int quantity, int numberOfWheels) {
        super(productName, id, quantity);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
