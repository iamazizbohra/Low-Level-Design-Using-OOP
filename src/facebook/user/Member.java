package facebook.user;

import facebook.ConnectionInvitation;
import facebook.Message;
import facebook.Post;
import facebook.Profile;

import java.util.Date;
import java.util.HashSet;
import java.util.Map;

public class Member extends Person {
    private Integer memberId;
    private Date dateOfMembership;
    private String name;

    private Profile profile;
    private HashSet<Integer> memberFollows;
    private HashSet<Integer> memberConnections;
    private HashSet<Integer> pageFollows;
    private HashSet<Integer> memberSuggestions;
    private HashSet<ConnectionInvitation> connectionInvitations;
    private HashSet<Integer> groupFollows;

    private Map<Integer, Integer> searchMemberSuggestions() {
        return null;
    }

    public void sendMessage(Message message) {
    }

    public void createPost(Post post) {
    }

    public void sendConnectionInvitation(ConnectionInvitation invitation) {
    }

    public String getName() {
        return null;
    }
}
