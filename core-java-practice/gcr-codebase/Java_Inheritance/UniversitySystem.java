package Java_Inheritance;
class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class Student extends Person2 {
    final String studentId;
    double gpa;

    Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() + ", Student{studentId='" + studentId + "', gpa=" + gpa + "}";
    }
}

class GradStudent extends Student {
    String thesis;

    GradStudent(String name, int age, String studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() + ", GradStudent{thesis='" + thesis + "'}";
    }

    public static void main(String[] args) {
        GradStudent g = new GradStudent("Rudra", 22, "S101", 9.2, "AI Security");
        System.out.println(g);
        System.out.println(g instanceof Student);
        System.out.println(g instanceof Person2);
    }
}