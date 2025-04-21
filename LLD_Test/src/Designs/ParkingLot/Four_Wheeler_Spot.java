package Designs.ParkingLot;

public class Four_Wheeler_Spot extends Spot{
    Four_Wheeler_Spot(int id, double cost, boolean occupied, Spot_Type type) {
        super(id, 40, false, Spot_Type.FOUR_WHEELER);
    }
}
