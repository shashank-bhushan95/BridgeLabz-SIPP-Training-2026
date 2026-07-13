package Scenarios;

public class WaterBottle {
    String ownerName;
    int dailyTarget;

    WaterBottle(String ownerName, int dailyTarget) {
        this.ownerName = ownerName;
        this.dailyTarget = dailyTarget;
    }

    void displayBottleInfo() {
        System.out.println(ownerName + " " + dailyTarget);
    }

    public static void main(String[] args) {
        new WaterBottle("A", 2).displayBottleInfo();
        new WaterBottle("B", 3).displayBottleInfo();
    }
}
