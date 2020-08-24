package repository;

import domain.TicketOffer;

public class TicketRepository {
    private TicketOffer[] items = new TicketOffer[0];

    public TicketOffer[] getAll() {
        return items;
    }

    public void save(TicketOffer item) {
        TicketOffer[] tmp = new TicketOffer[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public void removeById(int id) {
        TicketOffer[] tmp = new TicketOffer[items.length - 1];
        int index = 0;
        for (TicketOffer item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
}
