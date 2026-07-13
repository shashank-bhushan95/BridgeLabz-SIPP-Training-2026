package level1;

class MobilePhone {
    String brand, model;
    double price;

    MobilePhone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void display() {
        System.out.println(brand + " " + model + " " + price);
    }

    public static void main(String[] a) {
        new MobilePhone("Samsung", "S24", 1).display();
    }
}