package food.core.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Store {
    private UUID id;
    private String name;
    private PriceZone region;

    public Store(UUID id, String name) {
        this.id = id;
        this.name = name;
    }
}
