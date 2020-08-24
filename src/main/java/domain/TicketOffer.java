package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketOffer implements Comparable<TicketOffer> {
    private int id;
    private int cost;
    private String airportDeparture;
    private String airportArrival;
    private double travelTime;

    @Override
    public int compareTo(TicketOffer ticketOffer) {
        return cost - ticketOffer.cost;
    }
}
