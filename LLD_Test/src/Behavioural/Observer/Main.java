package Behavioural.Observer;

public class Main {
    public static void main(String[] args) {
        StockObservable niftyStockObservable = new NiftyStockObservable();
        StockObservable usStockObservable = new USStockObservable();

        StockObserver iphoneStockObserver1 = new IphoneStockObserver("Umang", niftyStockObservable);
        StockObserver iphoneStockObserver2 = new IphoneStockObserver("Umang", usStockObservable);

        StockObserver androidStockObserver = new AndroidStockObserver("Apoorv", niftyStockObservable);

        niftyStockObservable.add(iphoneStockObserver1);
        niftyStockObservable.add(iphoneStockObserver2);
        niftyStockObservable.add(androidStockObserver);

        niftyStockObservable.setStockPrice(100);
        niftyStockObservable.setStockPrice(50);
        niftyStockObservable.setStockPrice(150);
        niftyStockObservable.setStockPrice(200);

        usStockObservable.setStockPrice(500);
        usStockObservable.setStockPrice(450);
        usStockObservable.setStockPrice(600);
        usStockObservable.setStockPrice(550);
    }
}
