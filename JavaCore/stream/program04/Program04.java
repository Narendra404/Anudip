package stream.program04;

import java.util.ArrayList;
import java.util.List;

public class Program04 {
    public static void main(String[] args) {

//        This is the list of records:
//
//        List < Product > productsList = new ArrayList < Product > ();
//        // Adding Products
//        productsList.add(new Product(1, "HP Laptop", 25000 f));
//        productsList.add(new Product(2, "Dell Laptop", 30000 f));
//        productsList.add(new Product(3, "Lenevo Laptop", 28000 f));
//        productsList.add(new Product(4, "Sony Laptop", 28000 f));
//        productsList.add(new Product(5, "Apple Laptop", 90000 f));
//
//        1. Filter the records whose price is equal to 30000.
//        2. Filter the records whose price is less than 30000.
//        3. Add 18% GST tax to all product prices & show all products with updated prices.

        List<Product> productsList = new ArrayList<>();
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        System.out.println("\nProducts whose price is equal to 30000 : ");

        List<Product> records = productsList.stream().filter(x -> x.getProductPrice() == 30000f).toList();

        for (Product product : records) {
            System.out.println(product);
        }

        System.out.println("\nProducts whose price is less than 30000 : ");

        records = productsList.stream().filter(x -> x.getProductPrice() < 30000f).toList();

        for (Product product : records) {
            System.out.println(product);
        }

        System.out.println("\nProducts with 18% GST tax added to their prices : ");

//        records = productsList.stream().map(x -> {
//            x.setProductPrice(1.18f * x.getProductPrice());
//            return x;
//        }).toList();

//        productsList.stream().forEach(x -> x.setProductPrice(1.18f * x.getProductPrice()));

        for (Product product : productsList) {
            System.out.println(product);
        }
    }
}
