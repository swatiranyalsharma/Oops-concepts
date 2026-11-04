public class Member extends User{
    private static int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5; 
    public Member(){
        super();
        borrowedBooksCount++;
    }
    @Override
    public void displayDashboard(){
        System.out.println("borrowedBooksCount:"+ borrowedBooksCount);
    }
    @Override
    public boolean canBorrowBooks(){
        return borrowedBooksCount > MAX_BORROW_LIMIT;
    }
}
