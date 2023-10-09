package flight;

import java.util.ArrayList;
import java.util.List;

public class Aircraft implements FlightService{

    private String name;
    private String model;
    private int manufacturingYear;
    private FlightInstance flightInstance;
    private Aircraft aircraft;
    @Override
    public List<Flight> getFlights(){
        return new ArrayList<>();
    }

}
