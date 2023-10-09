package payment;

import enumeration.PaymentStatus;
import flightReservation.FlightReservation;

public abstract class Payment {
    private int paymentId;
    private double amount;
    private PaymentStatus status;
    private FlightReservation flightReservation;
    public abstract boolean makeTransaction();
}
