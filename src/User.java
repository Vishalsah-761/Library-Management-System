import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private ArrayList<Book> borrowedBooks;
    private static final int MAX_BORROW = 3;  // maximum books per user

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public ArrayList<Book> getBorrowedBooks() { return borrowedBooks; }

    public boolean canBorrow() {
        return borrowedBooks.size() < MAX_BORROW;
    }

    public void borrowBook(Book book) {
        if (canBorrow()) {
            borrowedBooks.add(book);
        } else {
            System.out.println(name + " has reached the maximum borrow limit (" + MAX_BORROW + ").");
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "User[ID: " + id + ", Name: " + name + "]";
    }
}
