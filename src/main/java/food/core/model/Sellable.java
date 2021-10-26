package food.core.model;

import java.util.UUID;

public interface Sellable {
   UUID id = UUID.randomUUID();

   public UUID getId();
}
