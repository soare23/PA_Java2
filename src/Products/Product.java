package Products;

public abstract class Product {
    private String productName;
    private int id;
    private int quantity;


    public Product(String productName, int id, int quantity) {
        this.productName = productName;
        this.id = id;
        this.quantity = quantity;
    }


    public String getProductName() {
        return productName;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
}
