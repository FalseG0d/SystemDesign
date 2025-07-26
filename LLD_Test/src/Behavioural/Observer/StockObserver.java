package Behavioural.Observer;

public abstract class StockObserver {
    String user;
    StockObservable stockObservable;

    StockObserver(String user, StockObservable stockObservable) {
        this.user = user;
        this.stockObservable = stockObservable;
    }

    public void update() {
        System.out.println(this.user + " recieved notification");
        System.out.println("The New Stock Price is: " + this.stockObservable.getStockPrice());
    }
}
