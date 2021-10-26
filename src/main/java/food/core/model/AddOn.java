package food.core.model;

import lombok.Data;

import java.util.UUID;

@Data
public class AddOn implements Sellable {
    private Ingredient ingredient;
    private Quantity quantity;
    private Price price;

    public AddOn(Ingredient ingredient, Quantity quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    @Override
    public UUID getId() {
        return id;
    }
}
