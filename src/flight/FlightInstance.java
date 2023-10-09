package flight;

import enumeration.FlightStatus;
import flightReservation.FlightSeat;
import user.Passenger;

import java.util.Date;
import java.util.Map;

public class FlightInstance {
    private Date departureTime;
    private FlightStatus status;

    public boolean cancel(){
        return true;
    }
    public boolean updateStatus(){
        return true;
    }
}
