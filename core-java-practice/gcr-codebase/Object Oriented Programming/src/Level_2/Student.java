package Level_2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int rollno;
    String name;
    List<Integer> marks;

    Student(int rollno, String name, List<Integer> marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public char fetchGrade() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        int average = total / marks.size();

        if (average > 80) {
            return 'A';
        } else if (average >= 65) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }

    public void display() {
        System.out.println("RollNo : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + fetchGrade());
    }

    public static void main(String[] args) {
        Student student = new Student(
                23,
                "Rudra",
                List.of(25, 80, 26, 54)
        );

        student.display();
    }
}