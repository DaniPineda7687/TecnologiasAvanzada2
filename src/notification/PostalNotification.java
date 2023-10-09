package notification;

import user.Address;

public class PostalNotification extends Notification{
    private Address address;

    @Override
    public boolean Send() {
        return false;
    }
}
