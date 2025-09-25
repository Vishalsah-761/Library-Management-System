# Library Management System in Java

Library Management System in Java using OOP to manage books and users with issue/return functionality, borrow limits, and user tracking.

## Overview
This is a mini Library Management System implemented in Java using Object-Oriented Programming (OOP) concepts.  
The system allows managing books and users, issuing and returning books, and tracking which books are borrowed by each user.



## Features
- Add new books with **title** and **author**  
- Add users with **unique ID** and **name**  
- Issue books with a **maximum borrow limit of 3 books per user**  
- Prevent users from borrowing the same book twice  
- Return books to the library  
- Display all books with availability status and issued user  
- Display all registered users  
- Display a user’s borrowed books **sorted by title**  



## OOP Concepts Used
- **Encapsulation:** Private data members with public methods  
- **Abstraction:** Library class provides high-level operations  
- **Polymorphism:** Method overriding (`toString()` in Book and User)  
- **HAS-A Relationship:** Library has Books and Users  
- **Dynamic Binding:** `toString()` resolved at runtime  
- **Constructor Usage:** For initializing objects  



## Project Structure
Library-Management-System-Java/
│── src/
│ ├── Book.java
│ ├── User.java
│ ├── Library.java
│ ├── Main.java


## How to Run
1. Open terminal in the project directory containing the `src` folder.  
2. Compile all Java files:
javac src/*.java
3. Run the program:
java -cp src Main

4. Follow the menu to add books, add users, issue/return books, and display data.


## Step-by-Step User Guide
1. **Add User:** Menu option `2` → Enter user ID and name  
2. **Add Book:** Menu option `1` → Enter book title and author  
3. **Issue Book:** Menu option `5` → Enter book title and user ID  
   - Max 3 books per user  
   - No duplicate borrowing  
4. **Return Book:** Menu option `6` → Enter book title  
5. **Show All Books:** Menu option `3`  
6. **Show All Users:** Menu option `4`  
7. **Show User's Borrowed Books:** Menu option `7` → Enter user ID  
8. **Exit:** Menu option `8`  



## Sample Output
====== Library Menu ======
1. Add Book
2. Add User
3. Show All Books
4. Show All Users
5. Issue Book
6. Return Book
7. Show User's Borrowed Books
8. Exit
Enter choice: 1
Enter book title: DSA in C
Enter author: john doe
DSA in C added to library.

====== Library Menu ======
1. Add Book
2. Add User
3. Show All Books
4. Show All Users
5. Issue Book
6. Return Book
7. Show User's Borrowed Books
8. Exit
Enter choice: 
3

? Library Books:
DSA in C by john doe - Available

====== Library Menu ======
1. Add Book
2. Add User
3. Show All Books
4. Show All Users
5. Issue Book
6. Return Book
7. Show User's Borrowed Books
8. Exit
Enter choice: 2
Enter user ID: 101
Enter user name: Vishal
User[ID: 101, Name: Vishal] added as library member.

====== Library Menu ======
1. Add Book
2. Add User
3. Show All Books
4. Show All Users
5. Issue Book
6. Return Book
7. Show User's Borrowed Books
8. Exit
Enter choice: 5
Enter book title to issue: DSA in C
Enter user ID: 101
DSA in C has been issued to Vishal.

====== Library Menu ======
1. Add Book
2. Add User
3. Show All Books
4. Show All Users
5. Issue Book
6. Return Book
7. Show User's Borrowed Books
8. Exit
Enter choice: 6
Enter book title to return: DSA in C
DSA in C has been returned by Vishal.

====== Library Menu ======
1. Add Book
2. Add User
3. Show All Books
4. Show All Users
5. Issue Book
6. Return Book
7. Show User's Borrowed Books
8. Exit
Enter choice: 8
Exiting... Thank you for using the Library System!
Java Programming



## Limitations
- Data is not persistent; program resets when closed  
- Terminal-based interface only  
- No advanced search or filtering (except sorted borrowed books)  


## Future Enhancements
- Save/load library data from a file for persistence  
- Track overdue books and return dates  
- GUI using Java Swing  
- Implement different user types (student, staff, admin)  
- Advanced search and filter options  


## Tools Used
- Java JDK  
- VS Code  
- Terminal

