package Java_Inheritance;
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef cooks food");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter serves food");
    }
}

class RestaurantManagement {
    public static void main(String[] args) {
        Chef c = new Chef("Aman", 1);
        Waiter w = new Waiter("Riya", 2);
        c.performDuties();
        w.performDuties();
    }
}