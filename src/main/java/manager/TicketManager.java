package manager;

import domain.TicketOffer;
import repository.TicketRepository;

import java.util.Arrays;
import java.util.Comparator;

public class TicketManager {
    private TicketRepository repository;

    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    public TicketOffer[] findAll(String from, String to, Comparator<TicketOffer>comparator) {
        TicketOffer[] result = new TicketOffer[0];
        for (TicketOffer offer : repository.getAll()) {
            if (offer.getAirportDeparture().equalsIgnoreCase(from) && offer.getAirportArrival().equalsIgnoreCase(to)) {
                TicketOffer[] tmp = new TicketOffer[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = offer;
                result = tmp;
            }
        }
        Arrays.sort(result,comparator);
        return result;
    }
}
