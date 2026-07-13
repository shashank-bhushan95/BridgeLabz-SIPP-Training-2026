import java.io.*;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) {
        String inputFile = "feedback.txt";
        int goodCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("good")) {
                    goodCount++;
                }
            }
            System.out.println("Good Feedback Count = " + goodCount);
        } catch (FileNotFoundException e) {
            System.out.println("Feedback file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("Error reading feedback file.");
        }
    }
}
