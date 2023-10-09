package flightReservation;

import enumeration.ReservationStatus;
import flight.Flight;
import flight.FlightInstance;
import notification.Notification;
import payment.Payment;
import user.Passenger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlightReservation {

    private String reservationNumber;
    private FlightInstance flight;
    private ReservationStatus status;
    private List<Notification> notificationList;
    private Payment payment;
    private Map<Passenger, FlightSeat> seatMap;
    public List<Passenger> getPassangers(){
        return new ArrayList<Passenger>();
    }

    public void setSeatMap(Map<Passenger, FlightSeat> seatMap) {
        this.seatMap = seatMap;
    }
    public FlightInstance createFlightInstance(){
        FlightInstance flightInstCreated = new FlightInstance();
        return flightInstCreated;
    }
    public Map<Passenger, FlightSeat> getSeatMap() {
        return seatMap;
    }
}
