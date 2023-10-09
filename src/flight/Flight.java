package flight;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightNumber;
    private Airport departure;
    private Airport arrival;
    private int durationInMinutes;


    public List<FlightInstance> getInstances(){
        return new ArrayList<>();
    }
    public boolean cancel(){
        return true;
    }

    public boolean addFlightSchedule(){
        return true;
    }
}
