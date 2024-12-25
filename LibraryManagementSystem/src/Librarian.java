public class Librarian extends User {

    private String employeeNumber;

    @Override
    void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book) {

    }

    void removeBook(Book book) {

    }

}
