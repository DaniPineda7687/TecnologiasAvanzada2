package user;

import flight.FlightInstance;

import java.util.ArrayList;
import java.util.List;

public class Pilot extends  Person{

    public List<FlightInstance> getFlights(){
        return new ArrayList<>();
    }
}
