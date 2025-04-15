package Behavioural.ObserverDP;

public class Main {
    public static void main(String[] args) {
        StockObservable niftyStockObservable = new NiftyStockObservable();
        StockObserver iphoneStockObserver1 = new IphoneStockObserver("Apoorv", niftyStockObservable);
        StockObserver iphoneStockObserver2 = new IphoneStockObserver("Umang", niftyStockObservable);

        niftyStockObservable.add(iphoneStockObserver1);
        niftyStockObservable.add(iphoneStockObserver2);

        niftyStockObservable.setStockPrice(100);
        niftyStockObservable.setStockPrice(50);
        niftyStockObservable.setStockPrice(150);
        niftyStockObservable.setStockPrice(200);
    }
}
