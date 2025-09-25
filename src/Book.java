public class Book {
    private String title;
    private String author;
    private boolean isIssued;
    private User issuedTo;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
        this.issuedTo = null;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isIssued() { return isIssued; }
    public User getIssuedTo() { return issuedTo; }

    public void issueBook(User user) {
        if (isIssued) {
            System.out.println(title + " is already issued to " + issuedTo.getName() + ".");
        } else if (!user.canBorrow()) {
            System.out.println(user.getName() + " cannot borrow more books (limit reached).");
        } else {
            isIssued = true;
            issuedTo = user;
            user.borrowBook(this);
            System.out.println(title + " has been issued to " + user.getName() + ".");
        }
    }

    public void returnBook() {
        if (isIssued) {
            issuedTo.returnBook(this);
            System.out.println(title + " has been returned by " + issuedTo.getName() + ".");
            isIssued = false;
            issuedTo = null;
        } else {
            System.out.println(title + " was not issued.");
        }
    }

    @Override
    public String toString() {
        if (isIssued) {
            return title + " by " + author + " - Issued to " + issuedTo.getName();
        } else {
            return title + " by " + author + " - Available";
        }
    }
}
