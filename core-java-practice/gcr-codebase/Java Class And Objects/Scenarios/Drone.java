package Scenarios;

public class Drone {
    String droneId;
    int batteryPercentage;
    static String companyName = "SkyLog";

    Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        batteryPercentage -= 10;
    }

    void displayStatus() {
        System.out.println(companyName + " " + droneId + " " + batteryPercentage);
    }

    public static void main(String[] args) {
        Drone d1 = new Drone("D1", 90), d2 = new Drone("D2", 80);
        d1.startDelivery();
        d2.startDelivery();
        d1.displayStatus();
        d2.displayStatus();
    }
}
