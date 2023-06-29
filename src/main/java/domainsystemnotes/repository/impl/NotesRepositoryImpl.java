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
        Notes notes = manager.createQuery("SELECT * FROM NOTES n WHERE n.id = ?", Notes.class).setParameter(1, id).getSingleResult();
        manager.close();
        return notes;
    }

    @Override
    public List<Notes> findAll() {
        return null;
    }

}
