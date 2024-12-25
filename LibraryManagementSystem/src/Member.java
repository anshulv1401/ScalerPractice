public class Member extends User {

    int borrowedBooksCount;
    int MAX_BORROW_LIMIT = 5;

    @Override
    void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
