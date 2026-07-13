package Level_1;

public class Employee {
    int id;
    String name;
    long salary;

    Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Rudra", 50000);
        emp.display();
    }
}