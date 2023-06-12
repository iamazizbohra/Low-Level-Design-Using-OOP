package onlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Catalog implements Searchable {
    List<Product> products;
    Map<ProductCategory, List<Product>> productsByCategory;

    @Override
    public List<Product> searchProductsByName(String name) {
        return new ArrayList<Product>();
    }

    @Override
    public List<Product> searchProductsByCategory(ProductCategory productCategory) {
        return new ArrayList<Product>();
    }
}
