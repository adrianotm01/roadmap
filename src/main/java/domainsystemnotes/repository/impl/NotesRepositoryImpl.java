package domainsystemnotes.repository.impl;

import java.util.List;
import java.util.stream.IntStream;

import domainsystemnotes.model.Notes;
import domainsystemnotes.repository.NotesRepository;
import jakarta.persistence.EntityManager;

public class NotesRepositoryImpl implements NotesRepository {

    private EntityManager manager;

    public NotesRepositoryImpl(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public Notes findById(Integer id) {
        manager.getTransaction().begin();
        Notes notes = manager.find(Notes.class, "");
        manager.close();
        return notes;
    }

    @Override
    public List<Notes> findAll() {
        IntStream.range(0, 10).forEach((n) -> System.out.println(n) );
        return null;
    }

}
