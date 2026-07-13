import java.io.*;

public class ProductInventoryChecker {
    public static void main(String[] args) {
        String inputFile = "inventory.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("-");
                if (parts.length != 2) continue;
                String item = parts[0].trim();
                int qty = Integer.parseInt(parts[1].trim());
                if (qty == 0) {
                    System.out.println(item + " is out of stock");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Inventory file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("Error reading inventory file.");
        }
    }
}
