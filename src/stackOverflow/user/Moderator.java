package stackOverflow.user;

import stackOverflow.Question;
import stackOverflow.notification.CanReceiveNotification;

public class Moderator implements CanReceiveNotification {
    private Account account;

    public void closeQuestion(Question question){

    }

    public void reopenQuestion(Question question){

    }
}
