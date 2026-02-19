abstract class Vehicle {
    private String vehicleNumber;
    private double rentalRate;

    public Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Car Insurance"; }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v = new Car("KA01AB1234", 2000);
        System.out.println("Rental Cost: " + v.calculateRentalCost(5));
    }
}
