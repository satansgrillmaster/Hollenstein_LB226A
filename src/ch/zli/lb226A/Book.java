package ch.zli.lb226A;

public class Book {

    private String bookTitle;

    /**
     * Constructor for the Book class, generate a new book
     * @param bookTitle the title from the book
     */
    public Book(String bookTitle){
        this.bookTitle = bookTitle;
    }

    /**
     * Getter for the Book title.
     * @return the title of the book
     */
    public String getTitle(){
        return bookTitle;
    }

}
