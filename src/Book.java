public abstract class Book implements Lendable {

    private String isbn;

    private String title;

    private String author;

    private boolean isAvailable;

    public Book(){
        isAvailable = true;
    }

    public Book(String isbn, String title, String author){
        this.isbn = isbn;
         this.title = title;
          this.author = author;
           this.isAvailable = true;
    }

    public Book(Book other){
        this.isbn = other.isbn;
         this.title = other.title;
          this.author = other.author;
           this.isAvailable = true;
    }

    @Override
    public boolean lend(User user){
        if(isAvailable && user.canBorrowBooks()){
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override 
    public void returnItem(User user){
        this.isAvailable = true;
    }

    public abstract void displayBookDetails();

}
