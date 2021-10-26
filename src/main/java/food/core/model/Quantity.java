package food.core.model;

import lombok.Data;

@Data
public class Quantity {
    private String unitType;
    private Number value;

    public Quantity(String unitType, Number value) {
        this.unitType = unitType;
        this.value = value;
    }
}
