package infraestructure;

import java.util.List;

public interface DataBaseOperations<T> {
    List<T> select();
    boolean insert(T entity);
    boolean update(T entity);
    boolean delete(int id);
}