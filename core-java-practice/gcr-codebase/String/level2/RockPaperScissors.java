import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        int choice = (int) (Math.random() * 3);

        if (choice == 0)
            return "Rock";
        if (choice == 1)
            return "Paper";

        return "Scissors";
    }

    public static String winner(String user, String comp) {

        if (user.equals(comp))
            return "Draw";

        if ((user.equals("Rock") && comp.equals("Scissors"))
                || (user.equals("Paper") && comp.equals("Rock"))
                || (user.equals("Scissors") && comp.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Games: ");
        int n = sc.nextInt();

        int userWins = 0;
        int compWins = 0;

        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter Rock/Paper/Scissors: ");
            String user = sc.next();

            String comp = computerChoice();

            String result = winner(user, comp);

            if (result.equals("User"))
                userWins++;

            else if (result.equals("Computer"))
                compWins++;

            System.out.println(i + "\t" + user + "\t" + comp + "\t\t" + result);
        }

        double userPercent = (userWins * 100.0) / n;
        double compPercent = (compWins * 100.0) / n;

        System.out.println("\nUser Wins = " + userWins);
        System.out.println("Computer Wins = " + compWins);

        System.out.printf("User Win %% = %.2f%%\n", userPercent);
        System.out.printf("Computer Win %% = %.2f%%\n", compPercent);
    }
}