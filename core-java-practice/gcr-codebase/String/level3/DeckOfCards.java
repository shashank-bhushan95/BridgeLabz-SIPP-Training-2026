import java.util.Scanner;

public class DeckOfCards {

    static String[] createDeck() {

        String[] suits = {
                "Hearts", "Diamonds",
                "Clubs", "Spades"
        };

        String[] ranks = {
                "2","3","4","5","6","7",
                "8","9","10","Jack",
                "Queen","King","Ace"
        };

        String[] deck = new String[52];

        int index = 0;

        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] =
                        rank + " of " + suit;
            }
        }

        return deck;
    }

    static void shuffle(String[] deck) {

        for (int i = 0; i < deck.length; i++) {

            int random =
                    i + (int)(Math.random() *
                    (deck.length - i));

            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    static void distribute(
            String[] deck,
            int players,
            int cards) {

        if (players * cards > 52) {

            System.out.println(
                    "Not enough cards");
            return;
        }

        int index = 0;

        for (int i = 0; i < players; i++) {

            System.out.println(
                    "\nPlayer " + (i + 1));

            for (int j = 0; j < cards; j++) {

                System.out.println(
                        deck[index++]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] deck = createDeck();

        shuffle(deck);

        System.out.print("Players: ");
        int players = sc.nextInt();

        System.out.print("Cards per Player: ");
        int cards = sc.nextInt();

        distribute(deck, players, cards);
    }
}