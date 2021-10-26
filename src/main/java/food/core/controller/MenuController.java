package food.core.controller;

import food.core.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class MenuController {
    @GetMapping(value = "menu/v1/{tenantId}/{brand}/{storeId}/",produces = "application/json")
    public Menu getMenu(@PathVariable String tenantId, @PathVariable String brand,@PathVariable String storeId) {
        final Menu menu = new StoreMenu(new Store(UUID.randomUUID(),storeId));

        final Tenant tenant = new Tenant(UUID.randomUUID(), tenantId);
        final Brand brand1 = new Brand(UUID.randomUUID(),tenant,brand);
        menu.setBrand(brand1);
        menu.setTenant(tenant);
        brand1.setName(brand);
        menu.setBrand(brand1);
        final List<Product> products = menu.getProducts();
        final Product farmhouse = new Product("Farmhouse Veg Pizza",UUID.randomUUID(),new Category("Pizza"));
        final ProductData productData = new ProductData();
        final AttributeDefn attributeDefn = new AttributeDefn("crust", "string");
        productData.setAttributeDefns(List.of(attributeDefn));
        farmhouse.setProductData(productData);
        products.add(farmhouse);
        farmhouse.getIngredients().add(new Ingredient("Cheese",UUID.randomUUID()));
        final Variant thinPizza = new Variant(farmhouse.getId(),"Thin Farmhouse Pizza");
        thinPizza.setAttributes(List.of(new Attribute(attributeDefn, "thin")));
        farmhouse.getVariants().add(thinPizza);
        final AddOn addOn = new AddOn(new Ingredient("Dip",UUID.randomUUID()),new Quantity("Number",1));
        addOn.setPrice(new Price(addOn,new Money("INR",100.0)));
        thinPizza.getAddOns().add(addOn);
        thinPizza.setPrice(new Price(thinPizza,new Money("INR",499.0)));
        return menu;
    }

}
