package facebook;

import facebook.enumeration.ConnectionInvitationStatus;
import facebook.user.Member;

import java.util.Date;

public class ConnectionInvitation {
    private Member memberInvited;
    private ConnectionInvitationStatus status;
    private Date dateCreated;
    private Date dateUpdated;

    public void acceptConnection() {
    }

    public void rejectConnection() {
    }
}
