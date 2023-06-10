package libraryManagementSystem.notification;

import libraryManagementSystem.Member;

public class ReservationCanceledNotification extends Notification {
    private Member member;

    public ReservationCanceledNotification(Member member) {
        this.member = member;
    }
}
