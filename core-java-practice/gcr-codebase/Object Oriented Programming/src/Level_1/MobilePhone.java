package Level_1;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    String brand;
    String model;
    int price;

    static List<MobilePhone> list = new ArrayList<>();

    MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display() {
        System.out.println("Mobile Brand : " + brand);
        System.out.println("Mobile Model : " + model);
        System.out.println("Mobile Price : " + price);
    }

    public void addDetails() {
        list.add(this);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Samsung", "S24", 70000);
        MobilePhone m2 = new MobilePhone("Apple", "iPhone 16", 80000);

        m1.addDetails();
        m2.addDetails();

        for (MobilePhone mobile : list) {
            mobile.display();
            System.out.println();
        }
    }
}