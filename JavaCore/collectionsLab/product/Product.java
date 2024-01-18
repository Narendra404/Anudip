package collectionsLab.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// a Product class with name and price that implements the Comparable interface
public class Product implements Comparable<Product> {

    private String name;
    private Integer price;

    public Product() {
        super();
    }

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // override the compareTo() method to sort in ascending order of the price
    @Override
    public int compareTo(Product o) {
        return (this.getPrice() - o.getPrice());
    }
}

// class to implement the Product class
class ProductImpl {

    // create list of products
    private final List<Product> products = new ArrayList<>();

    public ProductImpl() {

        // add products to the list
        products.add(new Product("Product 1", 10));
        products.add(new Product("Product 2", 15));
        products.add(new Product("Product 3", 5));
        products.add(new Product("Product 4", 8));
        products.add(new Product("Product 5", 12));
        products.add(new Product("Product 6", 7));
        products.add(new Product("Product 7", 9));
        products.add(new Product("Product 8", 11));
        products.add(new Product("Product 9", 6));
        products.add(new Product("Product 10", 14));
        products.add(new Product("Product 11", 4));
        products.add(new Product("Product 12", 18));
        products.add(new Product("Product 13", 13));
        products.add(new Product("Product 14", 16));
        products.add(new Product("Product 15", 22));
        products.add(new Product("Product 16", 19));
        products.add(new Product("Product 17", 8));
        products.add(new Product("Product 18", 7));
        products.add(new Product("Product 19", 9));
        products.add(new Product("Product 20", 10));

    }

    // method to add a product
    public void addProduct(Product product) {
       products.add(product);
    }

    // method to remove a product
    public void removeProduct(String productName) {
        products.removeIf(var -> var.getName().equalsIgnoreCase(productName));
    }

    // method to remove all products
    public void removeAllProducts() {
        for (Product var : products) {
            products.remove(var);
        }
    }

    // method to sort the products
    private void sortProducts() {
        Collections.sort(products);
    }

    // method to display products
    public void displayProducts() {

        // sort the products before displaying them
        sortProducts();

        for (Product var : products) {
            System.out.println(var);
        }
    }
}

// the driver application class
class App {
    // main method
    public static void main(String[] args) {

        // create ProductImpl class object
        ProductImpl obj = new ProductImpl();

        // display the sorted products
        obj.displayProducts();
    }
}