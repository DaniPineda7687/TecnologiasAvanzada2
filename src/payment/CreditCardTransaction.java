package payment;

public class CreditCardTransaction extends Payment{
    private String nameOnCard;

    @Override
    public boolean makeTransaction() {
        return false;
    }
}
