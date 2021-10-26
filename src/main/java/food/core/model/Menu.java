package food.core.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Menu {
    private Tenant tenant;
    private Brand brand;
    private List<Product> products = new ArrayList<>();
}
