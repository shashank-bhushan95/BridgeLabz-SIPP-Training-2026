package Java_Inheritance;
class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String c, int d, String p, boolean r, double fee, double discount) {
        super(c, d, p, r);
        this.fee = fee;
        this.discount = discount;
    }

    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse("Java", 30, "GLA", true, 5000, 10);
        System.out.println(c.courseName + " " + (c.fee - c.fee * c.discount / 100));
    }
}