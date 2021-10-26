package food.core.model;

import lombok.Data;

@Data
public class Nutrition {
    private String name;
    private String description;
    private Quantity quantity;
}
