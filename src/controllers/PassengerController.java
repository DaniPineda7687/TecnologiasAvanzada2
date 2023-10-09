package controllers;

import infraestructure.DataBaseOperations;
import infraestructure.PassangerRepository;
import user.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerController {

    private final PassangerRepository _passangerRepository;

    public PassengerController(PassangerRepository passangerRepository){
        _passangerRepository = passangerRepository;
    }

    public boolean createPassenger(Passenger passenger){
        return _passangerRepository.insert(passenger);
    }
    public List<Passenger> getPassengers(){
        return new ArrayList<>();
    }

    public Passenger getPassengerByPassportNumber(String passportNumber){
        return new Passenger();
    }

    public boolean deletePassenger(String passportNumber){
        return true;
    }

    public boolean updatePassenger(Passenger passengerUpdated){
        return true;
    }
}
