package onlineShoppingSystem;

import java.util.List;

public interface Searchable {
    public List<Product> searchProductsByName(String name);

    public List<Product> searchProductsByCategory(ProductCategory productCategory);
}
