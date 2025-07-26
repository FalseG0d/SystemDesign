package Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class StockObservable {
    int stockPrice = 0;
    List<StockObserver> stockObservers = new ArrayList<StockObserver>();

    public int getStockPrice() {
        return this.stockPrice;
    }
    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        this.notifyAllObservers();
    }
    public void notifyAllObservers() {
        for(StockObserver so: this.stockObservers) {
            so.update();
        }
    }
    public void add(StockObserver stockObserver) {
        this.stockObservers.add(stockObserver);
    }
}
