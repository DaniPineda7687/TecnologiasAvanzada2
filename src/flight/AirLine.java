package flight;

import java.util.ArrayList;
import java.util.List;

public class AirLine implements FlightService{
    private String name;
    private String code;
    @Override
    public List<Flight> getFlights(){
        return new ArrayList<>();
    }
}
