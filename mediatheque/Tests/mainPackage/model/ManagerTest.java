package mainPackage.model;

import mainPackage.controller.OperationsDesk;
import mainPackage.model.mediaItems.Book;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {



    @Test
    public void addToLibrary() {
        OperationsDesk operationsDesk = new OperationsDesk();
        Book book = new Book("1", "Some Author", 1984);
        Manager manager = new Manager(operationsDesk);
        Persistence persistence = new Persistence();


        assertTrue(operationsDesk.persistence.itemsInTheque.size() == 0);
        manager.addToLibrary(book);

        assertTrue(operationsDesk.persistence.itemsInTheque.size() == 1);



    }

    @Test
    public void removeFromLibrary() {
        OperationsDesk operationsDesk = new OperationsDesk();
        Book book = new Book("1", "Some Author", 1984);
        Manager manager = new Manager(operationsDesk);
        Persistence persistence = new Persistence();

        manager.addToLibrary(book);

        assertTrue(operationsDesk.persistence.itemsInTheque.size() == 1);

        manager.removeFromLibrary("1");

        assertTrue(operationsDesk.persistence.itemsInTheque.size() == 0);

    }


    @Test
    public void editMetaData() {
        assertTrue(false);

    }

}