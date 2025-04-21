package Designs.ParkingLot;

public class Spot {
    int id = 0;
    double cost = 0;
    boolean occupied = false;
    Spot_Type type = null;

    public Spot(int id, double cost, boolean occupied, Spot_Type type) {
        this.id = id;
        this.cost = cost;
        this.occupied = occupied;
        this.type = type;
    }
}
