package food.core.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Product {
    private String name;
    private UUID id;
    private Category category;
    private ProductData productData;
    private List<Ingredient> ingredients = new ArrayList<>();
    private List<Variant> variants = new ArrayList<>();

    public Product(String name, UUID id, Category category) {
        this.name = name;
        this.id = id;
        this.category = category;
    }
}
