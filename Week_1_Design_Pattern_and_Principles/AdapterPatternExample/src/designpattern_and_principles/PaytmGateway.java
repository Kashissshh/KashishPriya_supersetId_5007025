package designpattern_and_principles;

public class PaytmGateway {
	public String initiatePayment(double amount) {
        System.out.println("Initiating payment of " + amount + " through Paytm");
        
        return Math.random() < 0.8 ? "SUCCESS" : "FAILURE";  
    }
}
