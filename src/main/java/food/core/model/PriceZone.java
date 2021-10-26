package food.core.model;

import lombok.Data;

import java.util.UUID;

@Data
public class PriceZone {
    private UUID id;
    private UUID regionId;
}

