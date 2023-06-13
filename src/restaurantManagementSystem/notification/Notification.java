package restaurantManagementSystem.notification;

import java.util.Date;

public abstract class Notification {
    private int id;
    private String subject;
    private String body;
    private Date createdAt;
    private Date scheduledAt;
}
