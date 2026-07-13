package Java_Polymorphism;

class LibraryMember {
    String memberName, memberId;

    LibraryMember(String n, String i) {
        memberName = n;
        memberId = i;
    }

    double calculateFine(int d) {
        return 0;
    }

    void print() {
        System.out.println(memberName + " " + memberId);
    }
}

class StudentMember extends LibraryMember {
    StudentMember(String n, String i) {
        super(n, i);
    }

    double calculateFine(int d) {
        return d * 2;
    }
}

class FacultyMember extends LibraryMember {
    FacultyMember(String n, String i) {
        super(n, i);
    }

    double calculateFine(int d) {
        return d;
    }
}

class GuestMember extends LibraryMember {
    GuestMember(String n, String i) {
        super(n, i);
    }

    double calculateFine(int d) {
        return d * 5;
    }
}

public class SmartLibraryMembershipSystem {
    public static void main(String[] args) {
        LibraryMember[] m = {new StudentMember("A", "1"), new FacultyMember("B", "2"), new GuestMember("C", "3")};
        for (LibraryMember x : m) {
            x.print();
            System.out.println(x.calculateFine(4));
        }
        String id = "2";
        for (LibraryMember x : m) if (x.memberId.equals(id)) x.print();
    }
}