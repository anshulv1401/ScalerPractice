package Library;

public class Librarian extends User {

    private String employeeNumber;

    Librarian(String employeeNumber) {
        super();
        this.employeeNumber = employeeNumber;
    }

    Librarian(String employeeNumber, String name, String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    void displayDashboard() {
        System.out.println("Library.Librarian Dashboard");
        System.out.println("Name :" + getName());
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book) {
        System.out.println("New book added");
    }

    void removeBook(Book book) {
        System.out.println("Book removed");
    }

}
