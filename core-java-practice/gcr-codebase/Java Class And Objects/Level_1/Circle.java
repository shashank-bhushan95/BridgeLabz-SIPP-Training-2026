package Level_1;

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] a) {
        Circle c = new Circle(5);
        System.out.println(c.area());
        System.out.println(c.circumference());
    }
}