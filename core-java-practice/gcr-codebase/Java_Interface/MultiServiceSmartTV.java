package Java_Interface;

interface StreamingService {
    void streamMovie(String movie);

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription");
    }
}

interface GamingService {
    void playGame(String game);

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription");
    }
}

public class MultiServiceSmartTV implements StreamingService, GamingService {

    public void streamMovie(String movie) {
        System.out.println("Movie: " + movie);
    }

    public void playGame(String game) {
        System.out.println("Game: " + game);
    }

    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public static void main(String[] args) {
        String[] movies = {"Avatar", "Inception"};
        String[] games = {"FIFA", "Minecraft"};

        MultiServiceSmartTV tv = new MultiServiceSmartTV();
        tv.showSubscriptionDetails();

        for (String m : movies)
            tv.streamMovie(m);

        for (String g : games)
            tv.playGame(g);
    }
}
