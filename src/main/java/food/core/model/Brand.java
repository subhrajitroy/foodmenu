package food.core.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Brand {
    private UUID id;
    private Tenant tenant;
    private String name;

    public Brand(UUID id, Tenant tenant, String name) {
        this.id = id;
        this.tenant = tenant;
        this.name = name;
    }
}
