import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {
    @Test
    public void searchOne(){
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SPB", "NJC", 600, 8, 12);
        Ticket ticket2 = new Ticket("NJC", "SVX", 300, 18, 20);
        Ticket ticket3 = new Ticket("SPB", "NJC", 500, 2, 6);
        Ticket ticket4 = new Ticket("IST", "BKK", 1500, 5, 21);
        Ticket ticket5 = new Ticket("SPB", "NJC", 400, 23, 3);
        Ticket ticket6 = new Ticket("NJC", "VVO", 900, 8, 19);
        Ticket ticket7 = new Ticket("SPB", "NJC", 300, 12, 16);
        Ticket ticket8 = new Ticket("SPB", "NJC", 600, 9, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket6};
        Ticket[] actual = manager.search("NJC", "VVO");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchNothing(){
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SPB", "NJC", 600, 8, 12);
        Ticket ticket2 = new Ticket("NJC", "SVX", 300, 18, 20);
        Ticket ticket3 = new Ticket("SPB", "NJC", 500, 2, 6);
        Ticket ticket4 = new Ticket("IST", "BKK", 1500, 5, 21);
        Ticket ticket5 = new Ticket("SPB", "NJC", 400, 23, 3);
        Ticket ticket6 = new Ticket("NJC", "VVO", 900, 8, 19);
        Ticket ticket7 = new Ticket("SPB", "NJC", 300, 12, 16);
        Ticket ticket8 = new Ticket("SPB", "NJC", 600, 9, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {};
        Ticket[] actual = manager.search("IST", "NJC");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchSome(){
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SPB", "NJC", 600, 8, 12);
        Ticket ticket2 = new Ticket("NJC", "SVX", 300, 18, 20);
        Ticket ticket3 = new Ticket("SPB", "NJC", 500, 2, 6);
        Ticket ticket4 = new Ticket("IST", "BKK", 1500, 5, 21);
        Ticket ticket5 = new Ticket("SPB", "NJC", 400, 23, 3);
        Ticket ticket6 = new Ticket("NJC", "VVO", 900, 8, 19);
        Ticket ticket7 = new Ticket("SPB", "NJC", 300, 12, 16);
        Ticket ticket8 = new Ticket("SPB", "NJC", 600, 9, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket7, ticket5, ticket3, ticket1, ticket8};
        Ticket[] actual = manager.search("SPB", "NJC");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchSomeTimeFly(){
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SPB", "NJC", 600, 8, 12);
        Ticket ticket2 = new Ticket("NJC", "SVX", 300, 18, 20);
        Ticket ticket3 = new Ticket("SPB", "NJC", 500, 2, 5);
        Ticket ticket4 = new Ticket("IST", "BKK", 1500, 5, 21);
        Ticket ticket5 = new Ticket("SPB", "NJC", 400, 20, 22);
        Ticket ticket6 = new Ticket("NJC", "VVO", 900, 8, 19);
        Ticket ticket7 = new Ticket("SPB", "NJC", 300, 12, 13);
        Ticket ticket8 = new Ticket("SPB", "NJC", 600, 9, 14);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket7, ticket5, ticket3, ticket1, ticket8};
        Ticket[] actual = manager.search("SPB", "NJC", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchOneTimeFly(){
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SPB", "NJC", 600, 8, 12);
        Ticket ticket2 = new Ticket("NJC", "SVX", 300, 18, 20);
        Ticket ticket3 = new Ticket("SPB", "NJC", 500, 2, 5);
        Ticket ticket4 = new Ticket("IST", "BKK", 1500, 5, 21);
        Ticket ticket5 = new Ticket("SPB", "NJC", 400, 20, 22);
        Ticket ticket6 = new Ticket("NJC", "VVO", 900, 8, 19);
        Ticket ticket7 = new Ticket("SPB", "NJC", 300, 12, 13);
        Ticket ticket8 = new Ticket("SPB", "NJC", 600, 9, 14);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket6};
        Ticket[] actual = manager.search("NJC", "VVO", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchNothingTimeFly(){
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SPB", "NJC", 600, 8, 12);
        Ticket ticket2 = new Ticket("NJC", "SVX", 300, 18, 20);
        Ticket ticket3 = new Ticket("SPB", "NJC", 500, 2, 5);
        Ticket ticket4 = new Ticket("IST", "BKK", 1500, 5, 21);
        Ticket ticket5 = new Ticket("SPB", "NJC", 400, 20, 22);
        Ticket ticket6 = new Ticket("NJC", "VVO", 900, 8, 19);
        Ticket ticket7 = new Ticket("SPB", "NJC", 300, 12, 13);
        Ticket ticket8 = new Ticket("SPB", "NJC", 600, 9, 14);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = manager.search("IST", "NJC", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }

}
