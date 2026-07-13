import java.io.*;
import java.util.*;

public class SchoolResultPortal {
    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "report_card.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) continue;
                String name = parts[0].trim();
                int marks1 = Integer.parseInt(parts[1].trim());
                int marks2 = Integer.parseInt(parts[2].trim());
                double average = (marks1 + marks2) / 2.0;
                bw.write("Name: " + name + ", Marks: " + marks1 + ", " + marks2 + ", Average: " + average);
                bw.newLine();
            }
            System.out.println("Report card generated and appended to " + outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("Error processing files.");
        }
    }
}
