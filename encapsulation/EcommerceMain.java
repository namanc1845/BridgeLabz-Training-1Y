abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST"; }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.20; }
}

public class EcommerceMain {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics(1, "Laptop", 50000),
                new Clothing(2, "Shirt", 2000)
        };

        for (Product p : products) {
            double tax = (p instanceof Taxable)
                    ? ((Taxable) p).calculateTax()
                    : 0;

            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println("Final Price: " + finalPrice);
        }
    }
}
