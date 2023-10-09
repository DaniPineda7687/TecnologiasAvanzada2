package notification;

public class EmailNotification extends  Notification{
    private String email;

    @Override
    public boolean Send() {
        return false;
    }
}
