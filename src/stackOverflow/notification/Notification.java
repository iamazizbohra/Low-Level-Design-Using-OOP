package stackOverflow.notification;

import java.util.Date;

public abstract class Notification {
    private int notificationId;
    private Date createdOn;
    private Date scheduledOn;
    private String subject;
    private String body;

    public boolean sendNotification(CanReceiveNotification canReceiveNotification) {
        return true;
    }
}
