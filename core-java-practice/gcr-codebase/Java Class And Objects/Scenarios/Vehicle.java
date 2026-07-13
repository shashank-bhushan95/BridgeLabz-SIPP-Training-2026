package Scenarios;

public class Vehicle {
    String vehicleNumber, ownerName, vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void displayCars(Vehicle[] v) {
        for (Vehicle x : v) if (x.vehicleType.equals("Car")) System.out.println(x.vehicleNumber);
    }

    static void displayBikes(Vehicle[] v) {
        for (Vehicle x : v) if (x.vehicleType.equals("Bike")) System.out.println(x.vehicleNumber);
    }

    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[10];
        for (int i = 0; i < 10; i++) v[i] = new Vehicle("V" + i, "O" + i, i % 2 == 0 ? "Car" : "Bike");
        displayCars(v);
        displayBikes(v);
    }
}
