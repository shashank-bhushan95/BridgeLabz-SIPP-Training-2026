package Java_Inheritance;
class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println(model + " refueling");
    }
}

class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle("Tesla", 220);
        PetrolVehicle p = new PetrolVehicle("Honda", 180);
        e.charge();
        p.refuel();
    }
}