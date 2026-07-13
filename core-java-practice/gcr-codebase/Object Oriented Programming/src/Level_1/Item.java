package Level_1;

public class Item {
    int itemCode;
    String itemName;
    int price;

    public Item(int itemCode,String itemName,int price){
        this.itemCode  = itemCode;
        this.itemName  = itemName;
        this.price = price;
    }
    public  void display(){
        System.out.println("Itemcode :" + itemCode);
        System.out.println("ItemName :" + itemName);
        System.out.println("price :" + price);
    }
    public int calculate(int quantity){
        return quantity * price;
    }

    static void main() {
        Item i = new Item(25,"Rice", 45);
        int totalCost = i.calculate(5);
        i.display();
        System.out.println(totalCost);
    }
}
