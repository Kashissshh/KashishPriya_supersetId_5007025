package designpattern_and_principles;

public class WebApp implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println("Stock price updated to $" + stockPrice);
    }
} 
