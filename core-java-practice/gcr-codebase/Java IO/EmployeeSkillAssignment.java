import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String id;
    String name;
    String department;
    double salary;
    int[] skills;

    Employee(String id, String name, String department, double salary, int[] skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.skills = skills;
    }

    public String toString() {
        return id + ", " + name + ", " + department + ", " + salary;
    }
}

public class EmployeeSkillAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter employee id: ");
            String id = sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter department: ");
            String dept = sc.nextLine();
            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(sc.nextLine());
            System.out.print("Enter skill scores (comma-separated): ");
            String[] skillStr = sc.nextLine().split(",");
            int[] skills = new int[skillStr.length];
            for (int i = 0; i < skillStr.length; i++) {
                skills[i] = Integer.parseInt(skillStr[i].trim());
            }
            System.out.print("Enter target score: ");
            int target = Integer.parseInt(sc.nextLine());

            List<List<Integer>> teams = findProjectTeams(skills, target);
            System.out.println("Teams matching target: " + teams);

            Employee emp = new Employee(id, name, dept, salary, skills);
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
                oos.writeObject(emp);
            }
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
                Employee recovered = (Employee) ois.readObject();
                System.out.println("Recovered employee: " + recovered);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    private static List<List<Integer>> findProjectTeams(int[] skills, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(skills, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] skills, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || index == skills.length) {
            return;
        }
        current.add(skills[index]);
        backtrack(skills, target - skills[index], index + 1, current, result);
        current.remove(current.size() - 1);
        backtrack(skills, target, index + 1, current, result);
    }
}
