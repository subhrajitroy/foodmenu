package food.core.model;

import lombok.Data;

@Data
public class AttributeDefn {
    private String name;
    private String description;
    private String type;

    public AttributeDefn(String name,String type) {
        this.name = name;
        this.type = type;
    }
}
