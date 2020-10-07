package Products;

import Util.DateHandler;

public class DairyProducts extends Product {

    private DateHandler expiryDate;
    private MilkType type;

    public enum  MilkType{
        LONGLASTING,
        REGULAR,
    }

    public DairyProducts(String productName, int id, int quantity, MilkType type, DateHandler expiryDate) {
        super(productName, id, quantity);
        this.type = type;
        this.expiryDate = expiryDate;
    }


    public DateHandler getExpiryDate() {
        return expiryDate;
    }

    public MilkType getType() {
        return type;
    }
}
