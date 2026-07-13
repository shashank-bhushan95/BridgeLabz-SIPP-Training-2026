package Java_Polymorphism;

class Vehicle2 {
    String vehicleNumber, ownerName;

    Vehicle2(String v, String o) {
        vehicleNumber = v;
        ownerName = o;
    }

    double calculateToll() {
        return 0;
    }
}

class Car2 extends Vehicle2 {
    Car2(String v, String o) {
        super(v, o);
    }

    double calculateToll() {
        return 100;
    }
}

class Bus2 extends Vehicle2 {
    Bus2(String v, String o) {
        super(v, o);
    }

    double calculateToll() {
        return 250;
    }
}

class Truck extends Vehicle2 {
    Truck(String v, String o) {
        super(v, o);
    }

    double calculateToll() {
        return 400;
    }
}

public class SmartVehicleTollManagementSystem {
    public static void main(String[] args) {
        Vehicle2[] a = {new Car2("C1", "A"), new Bus2("B1", "B"), new Truck("T1", "C")};
        double total = 0, max = 0;
        Vehicle2 top = null;
        int c = 0, b = 0, t = 0;
        for (Vehicle2 v : a) {
            double x = v.calculateToll();
            total += x;
            if (x > max) {
                max = x;
                top = v;
            }
            if (v instanceof Car2) c++;
            else if (v instanceof Bus2) b++;
            else t++;
        }
        System.out.println(total);
        System.out.println(top.vehicleNumber);
        System.out.println(c + " " + b + " " + t);
    }
}