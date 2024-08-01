package designpattern_and_principles;

public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Call the original send method
        sendSMS(message);    // Add SMS sending functionality
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
