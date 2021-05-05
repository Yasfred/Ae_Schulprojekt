package de.bkwv.dajomatiti.frageantwortspiel.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Thema {
    @Id
    String PK_THEMA;
    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name="FK_FACH", nullable=false)
    Fach fach;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "thema")
    Collection<Frage> fragenliste;

}

