import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to library.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println(user + " added as library member.");
    }

    public void showBooks() {
        System.out.println("\n📚 Library Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showUsers() {
        System.out.println("\n👤 Library Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    public User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) return book;
        }
        return null;
    }

    public void issueBook(String title, int userId) {
        Book book = findBookByTitle(title);
        User user = findUserById(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        book.issueBook(user);
    }

    public void returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        book.returnBook();
    }

    public void showUserBooks(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        ArrayList<Book> borrowed = user.getBorrowedBooks();
        if (borrowed.isEmpty()) {
            System.out.println(user.getName() + " has not borrowed any books.");
        } else {
            System.out.println(user.getName() + " has borrowed the following books:");
            for (Book book : borrowed) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}
