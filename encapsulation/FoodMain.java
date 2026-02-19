abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public String getItemDetails() {
        return itemName + " - Qty: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - applyDiscount();
    }

    public double applyDiscount() {
        return 20; // Flat discount
    }

    public String getDiscountDetails() {
        return "Flat Rs.20 Discount";
    }
}

class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; // Extra charge
    }
}

public class FoodMain {
    public static void main(String[] args) {
        FoodItem item = new VegItem("Paneer Pizza", 200, 2);
        System.out.println(item.getItemDetails());
        System.out.println("Total Price: " + item.calculateTotalPrice());
    }
}
