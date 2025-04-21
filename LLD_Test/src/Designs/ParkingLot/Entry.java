package Designs.ParkingLot;

import java.time.LocalDate;

public class Entry extends Spot{
    TicketMaster ticketMaster;

    Entry(int id, TicketMaster ticketMaster) {
        super(id, 0, true, Spot_Type.ENTRY);
        this.ticketMaster = ticketMaster;
    }

    Ticket getTicket(Vehicle vehicle) {
        LocalDate currentDate = LocalDate.now();
        Ticket ticket = new Ticket(currentDate, ticketMaster.assignSpot(vehicle.type));
        ticket.spot.occupied = true;
        return ticket;
    }
}
