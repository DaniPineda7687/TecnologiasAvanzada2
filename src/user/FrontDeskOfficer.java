package user;

import flight.FlightInstance;
import flightReservation.FlightReservation;
import flightReservation.FlightSeat;
import notification.Notification;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrontDeskOfficer extends Person{

    private final Notification _notification;

    private List<Passenger> passengerList;
    private List<FlightInstance> flightInstancesList;

    public FrontDeskOfficer(Notification notification){
        _notification = notification;
    }
    public boolean createFlightReservation(String passportNumber){
        var passenger = searchPassengerByPassportNumber(passportNumber);
        if(passenger.isEmpty()){
            //No encontrado
            return false;
        }
        FlightReservation flightReservation = new FlightReservation();
        var seats = flightReservation.getSeatMap();
        seats.put(passenger.get(0), new FlightSeat());
        _notification.Send();
        return true;
    }

    public List<Passenger> searchPassengerByPassportNumber(String passportNumber){
        var findPassenger = new ArrayList<Passenger>();
        for (Passenger passenger:passengerList) {
            if(passenger.getPassportNumber().equals(passportNumber)){
                findPassenger.add(passenger);
            }
        }
        return  findPassenger;
    }
}
