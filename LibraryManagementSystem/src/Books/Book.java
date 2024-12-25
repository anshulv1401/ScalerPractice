package Books;

import Library.User;

public abstract class Book implements ILendable {

    String isbn;
    String title;
    String author;
    boolean isAvailable;

    public Book(){
        isAvailable = true;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        isAvailable = true;
    }

    public Book(Book book) {
        title = book.title;
        author = book.author;
        isAvailable = book.isAvailable;
    }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }

        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void displayBookDetails();
}
