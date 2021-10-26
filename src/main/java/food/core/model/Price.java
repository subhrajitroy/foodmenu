package food.core.model;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class Price {
    private UUID sellableId;
    private Money amount;
    private PriceZone applicableRegion;
    private Channel channel;
    private Date from;
    private Date till;

    public Price(Sellable sellable, Money amount) {
        this.sellableId = sellable.getId();
        this.amount = amount;
    }
}
