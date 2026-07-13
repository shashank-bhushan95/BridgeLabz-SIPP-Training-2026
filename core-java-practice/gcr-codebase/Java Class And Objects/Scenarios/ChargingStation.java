package Scenarios;

public class ChargingStation {
    static int totalStations;
    static double electricityRate = 8;
    String stationId;
    double unitsConsumed;

    ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println(stationId + " " + calculateBill());
    }

    public static void main(String[] args) {
        ChargingStation[] s = new ChargingStation[5];
        for (int i = 0; i < 5; i++) s[i] = new ChargingStation("S" + (i + 1), (i + 1) * 10);
        electricityRate = 9;
        for (ChargingStation c : s) c.displayStationDetails();
    }
}
