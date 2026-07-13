import java.io.*;

public class Problem5_TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            String first = br.readLine();
            System.out.println(first != null ? first : "");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
