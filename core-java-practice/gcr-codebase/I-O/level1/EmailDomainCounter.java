import java.io.*;

public class EmailDomainCounter {

    public static void main(String[] args) {

        int gmail = 0;
        int yahoo = 0;
        int other = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader("emails.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String domain = line.substring(line.indexOf("@") + 1);

                if (domain.equalsIgnoreCase("gmail.com"))
                    gmail++;

                else if (domain.equalsIgnoreCase("yahoo.com"))
                    yahoo++;

                else
                    other++;
            }

            br.close();

            System.out.println("Gmail Users = " + gmail);
            System.out.println("Yahoo Users = " + yahoo);
            System.out.println("Other Users = " + other);

        } catch (IOException e) {

            System.out.println("File Error");
        }
    }
}