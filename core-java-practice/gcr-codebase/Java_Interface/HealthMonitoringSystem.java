package Java_Interface;

interface HeartRateMonitor {
    void showHeartRate();

    default void displayHealthTips() {
        System.out.println("Exercise Daily");
    }

    static boolean isPatientIdValid(String id) {
        return id.length() == 5;
    }
}

interface TemperatureMonitor {
    void showTemperature();

    default void displayHealthTips() {
        System.out.println("Drink Water");
    }
}

public class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {
    public void showHeartRate() {
        System.out.println("Heart Rate: 72");
    }

    public void showTemperature() {
        System.out.println("Temperature: 98.6");
    }

    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    public static void main(String[] args) {
        String[] n = {"Rahul", "Neha"};
        String[] id = {"P1234", "12"};
        HealthMonitoringSystem h = new HealthMonitoringSystem();
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i] + " " + HeartRateMonitor.isPatientIdValid(id[i]));
            h.showHeartRate();
            h.showTemperature();
        }
    }
}
