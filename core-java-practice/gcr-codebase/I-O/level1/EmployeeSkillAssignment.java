import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {

    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.employeeId = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }
}

public class EmployeeSkillAssignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, dept, salary);

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("employee.dat"));

            out.writeObject(emp);

            out.close();

            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("employee.dat"));

            Employee e = (Employee) in.readObject();

            System.out.println(e.employeeId);
            System.out.println(e.name);
            System.out.println(e.department);
            System.out.println(e.salary);

            in.close();

        } catch (Exception e) {

            System.out.println("Error");
        }
    }
}