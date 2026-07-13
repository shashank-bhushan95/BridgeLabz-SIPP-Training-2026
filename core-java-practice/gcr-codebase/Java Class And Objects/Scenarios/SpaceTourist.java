package Scenarios;

public class SpaceTourist {
    static int totalReservations;
    static String missionName = "Mars";
    String touristName;
    int seatNumber;

    SpaceTourist(String touristName, int seatNumber) {
        this.touristName = touristName;
        this.seatNumber = seatNumber;
        totalReservations++;
    }

    SpaceTourist updateSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    public static void main(String[] args) {
        SpaceTourist t = new SpaceTourist("Alex", 1);
        t.updateSeatNumber(10).updateSeatNumber(15);
        System.out.println(t.touristName + " " + t.seatNumber);
    }
}
