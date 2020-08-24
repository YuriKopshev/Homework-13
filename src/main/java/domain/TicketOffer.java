package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketOffer implements  Comparator<TicketOffer>,Comparable<TicketOffer> {
    private int id;
    private int cost;
    private String airportDeparture;
    private String airportArrival;
    private double travelTime;

    @Override
    public int compareTo(TicketOffer ticketOffer) {
        return cost - ticketOffer.cost;
    }

    @Override
    public int compare(TicketOffer t1, TicketOffer t2) {
        return (int) (t1.getTravelTime()-t2.getTravelTime());
    }
}
