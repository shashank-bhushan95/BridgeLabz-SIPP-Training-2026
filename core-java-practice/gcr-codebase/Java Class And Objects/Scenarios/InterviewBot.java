package Scenarios;

public class InterviewBot {
    String botName, technology;

    InterviewBot(String botName, String technology) {
        this.botName = botName;
        this.technology = technology;
    }

    void conductInterview() {
        System.out.println(botName + " " + technology);
    }

    public static void main(String[] args) {
        new InterviewBot("Bot1", "Java").conductInterview();
        new InterviewBot("Bot2", "Python").conductInterview();
        new InterviewBot("Bot3", "AI").conductInterview();
    }
}
