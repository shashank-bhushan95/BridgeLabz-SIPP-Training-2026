package Level_1;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void calculate() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Area of object_oriented.Circle: %.2f%n", area);
        System.out.printf("Circumference of object_oriented.Circle: %.2f%n", circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle(25.453);
        c.calculate();
    }
}