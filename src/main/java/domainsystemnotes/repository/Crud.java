package domainsystemnotes.repository;

import java.util.List;

public interface Crud<T, I> {

    T findById(I id);

    List<T> findAll();

}
