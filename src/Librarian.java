public class Librarian extends User{
    private String employeeNumber;

    public Librarian(String employeeNumber) {
        super();
        this.employeeNumber = employeeNumber;
    }
    @Override
    public void displayDashboard(){
        System.out.println("employeeNumber:"+ employeeNumber);
    }
    @Override
    public boolean canBorrowBooks(){
        return true;
    }

    // void addNewBook(Book book){

    // }
    // void removeBook(Book book){

    // }

}
