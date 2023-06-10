package libraryManagementSystem.notification;

import libraryManagementSystem.Member;

public class BookAvailableNotification extends Notification {
    private Member member;

    public BookAvailableNotification(Member member) {
        this.member = member;
    }
}
