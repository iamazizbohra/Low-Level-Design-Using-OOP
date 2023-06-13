package stackOverflow;

import stackOverflow.enumeration.QuestionClosingRemark;
import stackOverflow.enumeration.QuestionStatus;
import stackOverflow.user.Member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question implements Searchable{
    private String title;
    private String description;
    private int viewCount;
    private int voteCount;
    private Date createdAt;
    private Date updatedAt;
    private QuestionStatus status;
    private QuestionClosingRemark closingRemark;
    private Member createdBy;
    private Bounty bounty;
    private List<Photo> photos;
    private List<Comment> comments;
    private List<Answer> answers;

    public void edit(){

    }

    public void close(){

    }
    public void reopen(){

    }
    public void addPhoto(Photo comment){

    }
    public void addComment(Comment comment){

    }
    public void addAnswer(Comment comment){

    }
    public void addBounty(Bounty bounty){

    }
    public List<Question> search(String query) {
        return new ArrayList<Question>();
    }
}
