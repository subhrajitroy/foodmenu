package food.core.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Variant implements Sellable{
    private UUID productId;
    private String name;
    private List<MediaAsset> mediaAssets;
    private Price price;
    private Availability availability;
    private List<AddOn> addOns = new ArrayList<>();
    private List<Nutrition> nutritions;
    private Integer servesNumberOfPeople;
    private List<Attribute> attributes;

    public Variant(UUID productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    @Override
    public UUID getId() {
        return id;
    }
}
