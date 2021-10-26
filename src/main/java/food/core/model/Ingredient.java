package food.core.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Ingredient {

    private String name;
    private UUID id;

    public Ingredient(String name, UUID id) {
        this.name = name;
        this.id = id;
    }
}
