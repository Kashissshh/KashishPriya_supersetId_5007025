package designpattern_and_principles;

public class PhonePeGateway {
	public boolean sendMoney(double amount) {
        System.out.println("Sending ₹" + amount + " through PhonePe");
        
        return Math.random() < 0.8;  
    }
}
