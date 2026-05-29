import java.util.ArrayList;

public class Library {

    // private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();

    public Library(){
        // this.books.add(new Movie("Shrek")); // need Object type for books
        this.books.add(new NonFictionBook(1.2, "Oppenheimer"));
        this.books.add(new FictionBook(5.5, "Great Expectations"));
        this.books.add(new FictionBook(5.7, "Twilight"));
        this.books.add(new NonFictionBook(1.4, "The John Adams Bio"));
    }

    // checkout a random book
    public Book checkout(){
        return this.books.get(0);
    }

}