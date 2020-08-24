package manager;

import domain.TicketOffer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.TicketRepository;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {
    private TicketRepository repository = new TicketRepository();
    private TicketManager manager = new TicketManager(repository);
    private TicketOffer ticketOffer1 = new TicketOffer(1,2000,"SVO","KLD",1.30);
    private TicketOffer ticketOffer2 = new TicketOffer(2,2500,"SVO","KLD",1.30);
    private TicketOffer ticketOffer3 = new TicketOffer(3,2100,"VKO","KLD",1.30);
    private TicketOffer ticketOffer4 = new TicketOffer(4,3000,"LED","KLD",1.40);
    private TicketOffer ticketOffer5 = new TicketOffer(5,4000,"SVO","KLD",1.30);
    private TicketOffer ticketOffer6 = new TicketOffer(6,3000,"KUF","KLD",2.00);

    @BeforeEach
    public void setUp(){
        repository.save(ticketOffer1);
        repository.save(ticketOffer2);
        repository.save(ticketOffer3);
        repository.save(ticketOffer4);
        repository.save(ticketOffer5);
        repository.save(ticketOffer6);
    }

    @Test
    void shouldFindAll() {
        TicketOffer[]actual = manager.findAll("SVO","KLD",ticketOffer1);
        TicketOffer[]expected = new TicketOffer[]{ticketOffer1,ticketOffer2,ticketOffer5};
        assertArrayEquals(actual,expected);

    }
    @Test
    void shouldNoFindTicket(){
        TicketOffer[]actual = manager.findAll("LED","SVO",ticketOffer1);
        TicketOffer[]expected = new TicketOffer[0];
        assertArrayEquals(actual,expected);

    }
}