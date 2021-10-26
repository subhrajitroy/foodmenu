package food.core.model;

import lombok.Data;

import java.util.List;

@Data
public class StoreMenu extends Menu{
    private Store store;
    private List<Product> exclusions;

    public StoreMenu(Store store) {
        this.store = store;
    }
}
