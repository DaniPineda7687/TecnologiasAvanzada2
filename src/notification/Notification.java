package notification;

import flightReservation.FlightReservation;

import java.util.Date;

public abstract class Notification {
    private int notificationId;
    private Date createdOn;
    private  String content;
    private FlightReservation flightReservation;

    public abstract boolean Send();
}