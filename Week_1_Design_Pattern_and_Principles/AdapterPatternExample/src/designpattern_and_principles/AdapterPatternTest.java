package designpattern_and_principles;

public class AdapterPatternTest {
	public static void main(String[] args) {
        
        PaymentProcessor paytmProcessor = new PaytmAdapter();
        PaymentProcessor phonePeProcessor = new PhonePeAdapter();

        processPayment(paytmProcessor, 1000.00);
        processPayment(phonePeProcessor, 1500.00);
    }

    private static void processPayment(PaymentProcessor processor, double amount) {
        boolean result = processor.processPayment(amount);
        System.out.println("Payment of ₹" + amount + " was " + (result ? "successful" : "failed"));
        System.out.println();
    }
}
