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

        // System.out.println(persistence.itemsInTheque.getFirst().id);

        assertTrue(operationsDesk.persistence.itemsInTheque.size() == 1);



    }

    @Test
    public void removeFromLibrary() {
        assertTrue(false);

    }


    @Test
    public void editMetaData() {
        assertTrue(false);

    }

}