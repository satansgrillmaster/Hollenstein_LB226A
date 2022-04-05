package ch.zli.lb226A;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    @Test
    public void lendOkTest(){
        Library library = new Library();
        Book book = new Book("buch");
        library.addBook("buch");
        library.addUser("user");
        Counter counter = new Counter(library);
        assertEquals(book.getTitle(), counter.lendBook("user", "buch").getTitle());
    }

    @Test
    public void lendNoBookTest(){
        Library library = new Library();
        library.addBook("buch");
        library.addUser("user");
        Counter counter = new Counter(library);
        assertEquals(null, counter.lendBook("user", "nobook"));
    }

    @Test
    public void lendNoUserTest(){
        Library library = new Library();
        library.addBook("buch");
        library.addUser("user");
        Counter counter = new Counter(library);
        assertThrows(SecurityException.class,()->{
            counter.lendBook("testuserfail","buch");
        });
    }

}
