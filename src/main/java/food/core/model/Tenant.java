package food.core.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Tenant {
    private UUID tenantId;
    private String name;

    public Tenant(UUID tenantId, String name) {
        this.tenantId = tenantId;
        this.name = name;
    }
}
