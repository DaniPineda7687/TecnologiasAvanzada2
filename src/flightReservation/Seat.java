package flightReservation;

import enumeration.SeatClass;
import enumeration.SeatType;

public class Seat {
    private String seatNumber;
    private SeatType type;
    private SeatClass Seatclass;

    public SeatType getSeatType(){
        return  type;
    }
}
