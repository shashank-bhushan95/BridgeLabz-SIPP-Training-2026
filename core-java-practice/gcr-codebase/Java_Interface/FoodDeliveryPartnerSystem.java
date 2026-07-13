package Java_Interface;

interface FoodDelivery {
    void deliverFood(String n);

    default void trackOrder() {
        System.out.println("Food Tracking");
    }

    static String generateDeliveryCode() {
        return "DLV1001";
    }
}

interface GroceryDelivery {
    void deliverGroceries(String n);

    default void trackOrder() {
        System.out.println("Grocery Tracking");
    }
}

public class FoodDeliveryPartnerSystem implements FoodDelivery, GroceryDelivery {
    public void deliverFood(String n) {
        System.out.println("Food delivered to " + n);
    }

    public void deliverGroceries(String n) {
        System.out.println("Groceries delivered to " + n);
    }

    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }

    public static void main(String[] args) {
        String[] c = {"Amit", "Sonia"};
        FoodDeliveryPartnerSystem d = new FoodDeliveryPartnerSystem();
        System.out.println(FoodDelivery.generateDeliveryCode());
        for (String s : c) {
            d.trackOrder();
            d.deliverFood(s);
            d.deliverGroceries(s);
        }
    }
}
