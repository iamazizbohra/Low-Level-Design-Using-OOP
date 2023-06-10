package libraryManagementSystem;

public class Member extends Account {
    private int createdAt;
    private LibraryCard libraryCard;
    private int totalBooksCheckout;

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }

    public int getTotalBooksCheckout() {
        return totalBooksCheckout;
    }

    public void setTotalBooksCheckout(int totalBooksCheckout) {
        this.totalBooksCheckout = totalBooksCheckout;
    }
}
