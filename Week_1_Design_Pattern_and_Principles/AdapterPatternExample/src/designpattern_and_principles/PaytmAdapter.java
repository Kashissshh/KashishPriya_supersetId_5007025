package designpattern_and_principles;

public class PaytmAdapter implements PaymentProcessor {
    private PaytmGateway paytmGateway;

    public PaytmAdapter() {
        this.paytmGateway = new PaytmGateway();
    }

    @Override
    public boolean processPayment(double amount) {
        String result = paytmGateway.initiatePayment(amount);
        return "SUCCESS".equals(result);
    }
}
