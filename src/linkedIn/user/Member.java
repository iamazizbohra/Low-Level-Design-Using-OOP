package linkedIn.user;

import linkedIn.*;

import java.util.Date;
import java.util.List;

public class Member extends Person{
    private Date dateOfMembership;
    private String headline;
    private byte[] photo;
    private List<Member> memberSuggestions;
    private List<Member> memberFollows;
    private List<Member> memberConnections;
    private List<Company> companyFollows;
    private List<Group> groupFollows;
    private Profile profile;

    public void sendMessage(Message message){

    }
    public void createPost(Post post){

    }

    public void sendConnectionInvitation(ConnectionInvitation invitation){

    }

    public String getName() {
        return null;
    }
}

