package level1;

class Item {
    String itemCode, itemName;
    double price;

    Item(String c, String n, double p) {
        itemCode = c;
        itemName = n;
        price = p;
    }

    double totalCost(int q) {
        return price * q;
    }

    void display() {
        System.out.println(itemCode + " " + itemName + " " + price);
    }

    public static void main(String[] a) {
        Item i = new Item("I1", "Pen", 10);
        i.display();
        System.out.println(i.totalCost(2));
    }
}