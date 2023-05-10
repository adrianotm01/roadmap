package domainsystemnotes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class EletronicNotes implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime date;



}
