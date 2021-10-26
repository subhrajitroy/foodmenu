package food.core.model;

import lombok.Data;

@Data
public class Attribute {
    private AttributeDefn attributeDefn;
    private Object value;

    public Attribute(AttributeDefn defn, Object value) {
        this.attributeDefn = defn;
        this.value = value;
    }
}
