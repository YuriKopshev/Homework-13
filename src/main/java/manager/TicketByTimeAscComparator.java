package manager;

import domain.TicketOffer;

import java.util.Comparator;

public class TicketByTimeAscComparator implements Comparator<TicketOffer> {
    @Override
    public int compare(TicketOffer t1, TicketOffer t2) {
        return (int) (t1.getTravelTime()-t2.getTravelTime());
    }
}
