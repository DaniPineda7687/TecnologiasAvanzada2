package payment;

public class CashTransaction extends Payment{
    private double cashTendered;

    @Override
    public boolean makeTransaction() {
        return false;
    }
}
