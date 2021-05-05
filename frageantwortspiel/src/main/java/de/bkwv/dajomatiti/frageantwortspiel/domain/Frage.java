package de.bkwv.dajomatiti.frageantwortspiel.domain;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Frage {
    @Id
    String PK_FRAGE;
    String FRAGENTEXT;
    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name="FK_THEMA", nullable=false)
    Thema thema;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "frage")
    Collection<Antwort> antwortliste;
    int SCHWIERIGKEITSSTUFE;
}
