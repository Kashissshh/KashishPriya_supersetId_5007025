package designpattern_and_principles;

public class PhonePeAdapter implements PaymentProcessor {
    private PhonePeGateway phonePeGateway;

    public PhonePeAdapter() {
        this.phonePeGateway = new PhonePeGateway();
    }

    @Override
    public boolean processPayment(double amount) {
        return phonePeGateway.sendMoney(amount);
    }

}
