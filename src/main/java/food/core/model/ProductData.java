package food.core.model;

import lombok.Data;

import java.util.List;

@Data
public class ProductData {
    private List<AttributeDefn> attributeDefns;
}
