package domainsystemnotes.view;

import java.util.List;

public interface MenuStrategy<T,S> {

    List<T> visualizeAll();

    T findById(S id);
}
