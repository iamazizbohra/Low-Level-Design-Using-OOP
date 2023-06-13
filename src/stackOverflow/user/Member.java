package stackOverflow.user;

import stackOverflow.Badge;
import stackOverflow.Question;
import stackOverflow.Tag;
import stackOverflow.notification.CanReceiveNotification;

import java.util.List;

public class Member implements CanReceiveNotification {
    private Account account;
    private int reputation;
    private List<Badge> badges;

    public int getReputation(){
        return this.reputation;
    }
    public void createQuestion(Question question){

    }

    public void createTag(Tag tag){

    }
}
