package flight;

import user.Address;

import java.util.ArrayList;
import java.util.List;

public class Airport implements FlightService{
    private String name;
    private Address address;
    private  String code;
    @Override
    public List<Flight> getFlights(){
        return new ArrayList<>();
    }
}
