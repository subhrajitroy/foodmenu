package food.core.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Availability {
    // Ingredient availability , item availability
    private UUID variantId;
    private Quantity quantity;
    private Store store;
    private Channel channel;
}
