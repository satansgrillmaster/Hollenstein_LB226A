package ch.zli.lb226A;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<User> users;

    /**
     * Constructor for the Library class, generate a new library object
     * generate two new arraylists.
     */
    public Library(){
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    /**
     * Add a new user to the library for security checks
     * @param userName the new users name
     */
    public void addUser(String userName){
        users.add(new User(userName));
    }

    /**
     * Add a new book to the library
     * @param bookTitle the tilte of the new book
     */
    public void addBook(String bookTitle){
        books.add(new Book(bookTitle));
    }

    /**
     * Check if the user is registered in the library, if successfully, return. Else throw a Security Exception
     * @param userName the users name for the security check
     */
    public boolean checkUserSecurity(String userName){
        for (User user : users){
            if (user.getUserName() == userName){
                return true;
            }
        }
        throw new SecurityException();
    }

    /**
     * Check if a book with the parameter bookTitle is in the libary, if so return the book object else return null
     * @param bookTitle the name of the book to lend out
     * @return the book if is in the library, else null
     */
    public Book getBook(String bookTitle){
        for (Book book : books){
            if (book.getTitle() == bookTitle){
                return book;
            }
        }
        return null;
    }

}
