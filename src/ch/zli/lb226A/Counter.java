package ch.zli.lb226A;

public class Counter {

    private Library library;

    /**
     * Constructor for the Library class, generate a new library object
     * @param library
     */
    public Counter(Library library){
        this.library = library;
    }

    /**
     * Lend out a book if it's in the library and the usercheck is successfully
     * @param userName String, the username
     * @param bookTitle String the title of the book
     * @return a book if success, else return null
     */
    public Book lendBook(String userName, String bookTitle){
        library.checkUserSecurity(userName);
        return library.getBook(bookTitle);
    }

}
