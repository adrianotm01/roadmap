package domainsystemnotes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Notes implements Serializable {

    private LocalDateTime date;

    private String content;

    private String title;

    @ManyToOne
    @JoinColumn(name = "id_eletronic_note")
    private EletronicNotes eletronicNotes;

}
