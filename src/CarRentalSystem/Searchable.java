package CarRentalSystem;

import java.util.List;

public interface Searchable {
    public List<Vehicle> searchByType(String type);

    public List<Vehicle> searchByModel(String model);
}
