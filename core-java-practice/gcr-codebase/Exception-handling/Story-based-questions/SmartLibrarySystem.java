public class SmartLibrarySystem {
    private static String[] books = {"Java", "Python", null, "C++"};

    public static int getBookLength(int index) {
        try {
            String title = books[index];
            return title.length();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: no book at that position.");
            return -1;
        } catch (NullPointerException e) {
            System.out.println("Book entry is null at the requested index.");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getBookLength(1)); // valid
        System.out.println(getBookLength(2)); // null
        System.out.println(getBookLength(10)); // invalid
    }
}
