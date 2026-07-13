package Java_Interface;

interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

public class OnlineCouponValidator implements CouponValidator {

    public boolean validateCoupon(String code) {
        return CouponValidator.isLengthValid(code) && code.startsWith("SAVE");
    }

    public static void main(String[] args) {
        String[] coupons = {"SAVE10", "OFF", "SAVE50", "ABC12"};
        OnlineCouponValidator cart = new OnlineCouponValidator();

        for (String c : coupons) {
            System.out.println(c + " : " + (cart.validateCoupon(c) ? "Valid" : "Invalid"));
        }
    }
}
