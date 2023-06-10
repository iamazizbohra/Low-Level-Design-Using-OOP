package libraryManagementSystem.notification;

import libraryManagementSystem.Member;

public class OverdueNoticeNotification extends Notification {
    private Member member;

    public OverdueNoticeNotification(Member member) {
        this.member = member;
    }
}
