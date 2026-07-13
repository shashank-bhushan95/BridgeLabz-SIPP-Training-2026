import java.io.*;
import java.util.*;

public class EmailDomainCounter {
    public static void main(String[] args) {
        String inputFile = "emails.txt";
        Map<String, Integer> domainCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.contains("@")) continue;
                String domain = line.substring(line.indexOf('@') + 1);
                domainCount.put(domain, domainCount.getOrDefault(domain, 0) + 1);
            }
            domainCount.forEach((domain, count) -> System.out.println(domain + ": " + count));
        } catch (FileNotFoundException e) {
            System.out.println("Email file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("Error reading email file.");
        }
    }
}
