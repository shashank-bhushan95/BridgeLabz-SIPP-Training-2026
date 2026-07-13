public class MovieSeatReservation {
    private static int[] seats = {101, 102, 103, 104, 105};

    public static int getSeat(int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Requested seat index is invalid.");
            return -1;
        }
    }

    public static void main(String[] args) {
        int seat = getSeat(8);
        System.out.println("Seat returned: " + seat);
    }
}
