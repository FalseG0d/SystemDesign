package Designs.ParkingLot;

import java.time.LocalDate;

abstract public class Exit extends Spot{
    Exit(int id) {
        super(id, 0, true, Spot_Type.EXIT);
    }

    double getSpotCost(Spot_Type type) {
        return 0;
    }

    double getTime(LocalDate localDate) {
        return 0;
    }

    double getCost(Ticket ticket) {
        ticket.spot.occupied = false;
        return getSpotCost(ticket.spot.type) * getTime(ticket.time);
    }
}
