package domainsystemnotes.service;

import java.util.List;

import domainsystemnotes.model.Notes;
import domainsystemnotes.repository.NotesRepository;
import domainsystemnotes.view.MenuStrategy;

public class NotesService implements MenuStrategy<Notes,Integer> {

    private NotesRepository notesRepository;

    public NotesService(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    @Override
    public List<Notes> visualizeAll() {
        return notesRepository.findAll();
    }

    @Override
    public Notes findById(Integer id) {
        return null;
    }

}
