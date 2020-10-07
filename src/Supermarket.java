import Products.DairyProducts;
import Products.Product;
import Util.DateHandler;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    List<Product> listOfProducts = new ArrayList<>();
    private int numberOfSourMilk;

    public void addProduct(Product product){
        if(product instanceof DairyProducts){
            if(((DairyProducts) product).getExpiryDate().getYear() < Util.DateHandler.getCurrentDate().getYear()){
                numberOfSourMilk += 1;
                System.out.println("This Dairy Product is expired.");
                System.out.println("There are " + numberOfSourMilk + " expired Dairy Products");
            } else {
                listOfProducts.add(product);
            }
        } else {
            listOfProducts.add(product);
        }
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }
}
