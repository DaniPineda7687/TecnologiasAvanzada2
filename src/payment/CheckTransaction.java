package payment;

public class CheckTransaction extends Payment{
    private String bankName;
    private String checkNumber;

    @Override
    public boolean makeTransaction() {
        return false;
    }
}
