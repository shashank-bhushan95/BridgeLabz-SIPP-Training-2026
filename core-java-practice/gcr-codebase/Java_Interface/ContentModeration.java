package Java_Interface;

interface TextModeration {
    boolean checkText(String post);

    default void displayModerationPolicy() {
        System.out.println("Text Policy");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("bad");
    }
}

interface SpamDetection {
    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam Policy");
    }
}

public class ContentModeration implements TextModeration, SpamDetection {

    public boolean checkText(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean checkSpam(String post) {
        return post.toLowerCase().contains("buy now");
    }

    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args) {
        String[] posts = {
                "Hello everyone",
                "Buy now offer",
                "This is bad",
                "Nice day"
        };

        ContentModeration cm = new ContentModeration();
        cm.displayModerationPolicy();

        for (String p : posts) {
            if (cm.checkSpam(p))
                System.out.println("Spam: " + p);
            else if (cm.checkText(p))
                System.out.println("Offensive: " + p);
            else
                System.out.println("Valid: " + p);
        }
    }
}
