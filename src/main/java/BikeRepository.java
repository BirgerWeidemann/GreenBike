import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BikeRepository implements Repository<Bike> {

    private final Map<String, Bike> store = new LinkedHashMap<>();

    @Override
    public boolean save(Bike bike) {
        // GUARDS
        if (bike == null) {
            throw new IllegalArgumentException("Bike must not be null");
        }
        if (bike.id == null) {
            throw new IllegalArgumentException("Bike.id must not be null or blank");
        }

        boolean isNew = !store.containsKey(bike.id);
        store.put(bike.id, bike);
        return isNew;
    }


    @Override
    public Bike getByIdOrThrow(String id) {
        // GUARDS
        if (id == null) {
            throw new IllegalArgumentException("id must not be null or blank");
        }

        Bike o = store.get(id);
        if (o == null) throw new java.util.NoSuchElementException("unknown id " + id);
        return o;
    }


    @Override
    public boolean deleteById(String id) {
        // GUARDS
        if (id == null) {
            throw new IllegalArgumentException("id must not be null or blank");
        }

        return store.remove(id) != null;
    }

    @Override
    public List<Bike> listAll() {
        // nie null zurückgeben
        return new ArrayList<>(store.values());
    }
}
