package ch.zli.lb226A;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        library.addBook("buch");
        library.addUser("max");
        Counter counter = new Counter(library);
    }

}
