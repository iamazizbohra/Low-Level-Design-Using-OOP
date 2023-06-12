package onlineShoppingSystem;

import onlineShoppingSystem.user.Member;

import java.util.Date;

public class ProductReview {
    private int productId;
    private Date date;
    private int rating;
    private String review;
    private Member reviewer;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Member getReviewer() {
        return reviewer;
    }

    public void setReviewer(Member reviewer) {
        this.reviewer = reviewer;
    }
}
