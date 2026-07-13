package Java_Interface;

interface LuggageScanner {
    void scanLuggage();

    default void displaySecurityGuidelines() {
        System.out.println("Luggage Rules");
    }

    static boolean isPassportNumberValid(String p) {
        return p.length() == 8;
    }
}

interface PassportVerifier {
    void verifyPassport();

    default void displaySecurityGuidelines() {
        System.out.println("Passport Rules");
    }
}

public class AirportSecurityManagement implements LuggageScanner, PassportVerifier {
    public void scanLuggage() {
        System.out.println("Luggage Scanned");
    }

    public void verifyPassport() {
        System.out.println("Passport Verified");
    }

    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }

    public static void main(String[] args) {
        String[] n = {"Aman", "Riya"};
        String[] id = {"AB123456", "123"};
        for (int i = 0; i < n.length; i++)
            System.out.println(n[i] + " : " + (LuggageScanner.isPassportNumberValid(id[i]) ? "Board" : "Rejected"));
    }
}
