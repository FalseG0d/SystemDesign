package Designs.ParkingLot;

import java.time.LocalDate;

public class Ticket {
    public LocalDate time;
    public Spot spot;

    Ticket(LocalDate time, Spot spot) {
        this.time = time;
        this.spot = spot;
    }
}
