package Java_Polymorphism;

class RescueTeam {
    String teamId, location;

    RescueTeam(String i, String l) {
        teamId = i;
        location = l;
    }

    void performDuty() {
    }
}

class MedicalTeam extends RescueTeam {
    MedicalTeam(String i, String l) {
        super(i, l);
    }

    void performDuty() {
        System.out.println("Medical");
    }
}

class FireRescueTeam extends RescueTeam {
    FireRescueTeam(String i, String l) {
        super(i, l);
    }

    void performDuty() {
        System.out.println("Fire");
    }
}

class FoodSupplyTeam extends RescueTeam {
    FoodSupplyTeam(String i, String l) {
        super(i, l);
    }

    void performDuty() {
        System.out.println("Food");
    }
}

public class DisasterRescueManagementSystem {
    public static void main(String[] args) {
        RescueTeam[] r = {new MedicalTeam("M1", "Delhi"), new FireRescueTeam("F1", "Agra"), new FoodSupplyTeam("FS1", "Delhi"), new MedicalTeam("M2", "Delhi")};
        int m = 0, f = 0, fs = 0;
        for (RescueTeam x : r) {
            x.performDuty();
            if (x.location.equals("Delhi")) System.out.println(x.teamId);
            if (x.teamId.startsWith("M")) System.out.println(x.teamId);
            if (x instanceof MedicalTeam) m++;
            else if (x instanceof FireRescueTeam) f++;
            else fs++;
        }
        System.out.println(m + " " + f + " " + fs);
        System.out.println(m >= f && m >= fs ? "Medical" : "Other");
    }
}