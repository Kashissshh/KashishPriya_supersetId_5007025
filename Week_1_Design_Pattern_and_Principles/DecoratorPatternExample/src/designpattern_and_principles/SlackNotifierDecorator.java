package designpattern_and_principles;

public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Call the original send method
        sendSlack(message); // Add Slack sending functionality
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}
