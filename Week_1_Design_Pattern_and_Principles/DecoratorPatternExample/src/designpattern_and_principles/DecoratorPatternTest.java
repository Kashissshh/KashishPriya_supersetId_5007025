package designpattern_and_principles;

public class DecoratorPatternTest {
	public static void main(String[] args) {
    // Create a basic EmailNotifier
    Notifier emailNotifier = new EmailNotifier();

    // Decorate EmailNotifier with SMS functionality
    Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);
    
    // Decorate SMSNotifier with Slack functionality
    Notifier slackSMSNotifier = new SlackNotifierDecorator(smsEmailNotifier);

    // Send a notification through all channels
    slackSMSNotifier.send("Hello.....");
}
}