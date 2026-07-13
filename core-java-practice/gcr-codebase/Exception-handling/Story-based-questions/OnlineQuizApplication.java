public class OnlineQuizApplication {
    public static void main(String[] args) {
        String[] answers = {"A", "B", "C", "D"};
        String[] studentResponses = {"A", "X", null, "D", "A"};

        for (int i = 0; i < studentResponses.length; i++) {
            try {
                String response = studentResponses[i];
                if (answers[i].equals(response)) {
                    System.out.println("Q" + i + ": Correct");
                } else {
                    System.out.println("Q" + i + ": Incorrect");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No correct answer defined for Q" + i + "; skipping.");
            } catch (NullPointerException e) {
                System.out.println("Student skipped Q" + i + "; continuing.");
            }
        }
    }
}
