package designpattern_and_principles;

public class Test {
	public static void main(String[] args) {
        // Create the stock market (subject)
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(150.75);
        stockMarket.setStockPrice(155.30);

        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice(160.00);
    }
}


