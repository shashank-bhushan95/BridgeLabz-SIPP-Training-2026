package level1;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void display() {
        System.out.println(name + " " + id + " " + salary);
    }

    public static void main(String[] a) {
        new Employee("R", 1, 1).display();
    }
}