package mainPackage.model;

import mainPackage.controller.OperationsDesk;
import mainPackage.model.mediaItems.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    private OperationsDesk operationsDesk;
    private Book book;
    private Manager manager;
    private Persistence persistence;

    @Before
    public void setUp() {
        operationsDesk = new OperationsDesk();
        book = new Book("1", "Some Author", 1984);
        manager = new Manager(operationsDesk);
        persistence = operationsDesk.persistence;
    }



    @Test
    public void addToLibrary() {

        assertTrue(operationsDesk.persistence.itemsInTheque.size() == 0);
        manager.addToLibrary(book);

        assertTrue(operationsDesk.persistence.itemsInTheque.size() == 1);



    }

    @Test
    public void removeFromLibrary() {

        persistence.itemsInTheque.add(book);

        assertTrue(operationsDesk.persistence.itemsInTheque.size() == 1);

        manager.removeFromLibrary("1");

        assertTrue(operationsDesk.persistence.itemsInTheque.size() == 0);

    }


    @Test
    public void editMetaData() {

        persistence.itemsInTheque.add(book);

        assertTrue("1".equals(persistence.itemsInTheque.get(0).id));
        assertTrue("Some Author".equals(persistence.itemsInTheque.get(0).author));
        assertTrue(persistence.itemsInTheque.get(0).releaseDate == 1984);

        manager.editMetadata("1", "totallyNewAuthor", 2084);

        assertTrue("1".equals(persistence.itemsInTheque.get(0).id));
        assertTrue("totallyNewAuthor".equals(persistence.itemsInTheque.get(0).author));
        assertTrue(persistence.itemsInTheque.get(0).releaseDate == 2084);
    }

}