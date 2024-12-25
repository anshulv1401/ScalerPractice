package Library;

public class Member extends User {

    private int borrowedBooksCount;
    static final int MAX_BORROW_LIMIT = 5;

    Member() {
        super();
        borrowedBooksCount = 0;
    }

    Member(String name, String contactInfo) {
        super(name, contactInfo);
        borrowedBooksCount = 0;
    }

    @Override
    void displayDashboard() {
        System.out.println("Library.Member Dashboard");
        System.out.println("Name" + getName());
        System.out.println("Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
