package infraestructure;

import user.Passenger;

import java.util.List;

public class PassangerRepository implements DataBaseOperations<Passenger>{
    @Override
    public List<Passenger> select() {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean insert(Passenger entity) {
        return false;
    }

    @Override
    public boolean update(Passenger entity) {
        return false;
    }
}
