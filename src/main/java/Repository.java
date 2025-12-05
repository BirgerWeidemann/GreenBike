import java.util.List;

public interface Repository<T extends Order> {

     boolean save(T order);

     T getByIdOrThrow(String id);

     boolean deleteById(String id);

     List<T> listAll();
}
