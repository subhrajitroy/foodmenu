package food.core.model;

import lombok.Data;

@Data
public class Money {
    private String currency;
    private Double value;

    public Money(String currency, Double value) {
        this.currency = currency;
        this.value = value;
    }
}
