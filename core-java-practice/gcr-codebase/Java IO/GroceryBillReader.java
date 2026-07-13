import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) {
        String inputFile = "bill.txt";
        int lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }
            System.out.println("Total number of lines: " + lineCount);
        } catch (FileNotFoundException e) {
            System.out.println("Bill file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("Error reading bill file.");
        }
    }
}
