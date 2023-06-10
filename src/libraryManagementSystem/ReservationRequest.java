package libraryManagementSystem;

import libraryManagementSystem.enumeration.ReservationStatus;

public class ReservationRequest {
    private int no;
    private Member member;

    private ReservationStatus status;

    public ReservationRequest(Member member, ReservationStatus status) {
        this.member = member;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
