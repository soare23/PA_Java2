import Products.DairyProducts;
import Products.Shovels;
import Products.Trucks;
import Util.DateHandler;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Supermarket supermarket = new Supermarket();
        DateHandler date1 = new DateHandler(23, "februray", 1994);
        DateHandler date2 = new DateHandler(10,"march", 2023);
        DairyProducts milk1 = new DairyProducts("Zuzu",1,2, DairyProducts.MilkType.REGULAR, date1);
        DairyProducts milk2 = new DairyProducts("Napolact", 2,3, DairyProducts.MilkType.LONGLASTING, date2);
        Shovels shovel1 = new Shovels("lopata mica", 32, 1, Shovels.Size.SMALL, Shovels.Material.PLASTIC);
        Trucks truck1 = new Trucks("Volvo", 20,3,18);

        supermarket.addProduct(milk1);
        supermarket.addProduct(milk2);
        supermarket.addProduct(shovel1);
        supermarket.addProduct(truck1);
        supermarket.getListOfProducts().forEach(product -> {
            System.out.println(product.getProductName());
        });
    }
}
