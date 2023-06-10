package libraryManagementSystem;

import libraryManagementSystem.enumeration.AccountStatus;

public class Librarian extends Account {
    public void addBook(BookItem book) {

    }

    public void modifyBook(BookItem book) {
    }

    public void removeBook(BookItem book) {

    }

    public void blockMember(Member member) {
        member.setStatus(AccountStatus.INACTIVE);
    }

    public void unblockMember(Member member) {
        member.setStatus(AccountStatus.ACTIVE);
    }

    public void blacklistMember(Member member) {
        member.setStatus(AccountStatus.BLACKLIST);
    }
}
