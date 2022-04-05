package ch.zli.lb226A;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void addUserTest(){
        Library library = new Library();
        library.addUser("testuser");
    }

    @Test
    public void getAvailableBookTest(){
        Library library = new Library();
        Counter counter = new Counter(library);
        Book book = new Book("testbook");
        library.addBook("testbook");
        library.addUser("testuser");
        assertEquals(book.getTitle(),counter.lendBook("testuser","testbook").getTitle());
    }

    @Test
    public void getUnavailableBookTest(){
        Library library = new Library();
        Counter counter = new Counter(library);
        library.addUser("testuser");
        assertEquals(null,counter.lendBook("testuser","testbook"));
    }

    @Test
    public void getAvailableUserTest(){
        Library library = new Library();
        library.addUser("testuser");
        assertTrue(library.checkUserSecurity("testuser"));
    }

    @Test
    public void getUnavailableUserTest(){
        Library library = new Library();
        library.addUser("testuser");
        assertThrows(SecurityException.class,()->{
            library.checkUserSecurity("testuserfail");
        });
    }

}
