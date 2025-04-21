package Designs.ParkingLot;

public class Two_Wheeler_Spot extends Spot{
    Two_Wheeler_Spot(int id, double cost, boolean occupied, Spot_Type type) {
        super(id, 20, false, Spot_Type.TWO_WHEELER);
    }
}
