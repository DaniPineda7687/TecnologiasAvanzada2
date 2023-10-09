package notification;

public class SmsNotification extends Notification{
    private String email;

    @Override
    public boolean Send() {
        return false;
    }
}
