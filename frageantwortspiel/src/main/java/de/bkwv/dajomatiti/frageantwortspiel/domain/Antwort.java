package de.bkwv.dajomatiti.frageantwortspiel.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Antwort {
    @Id
    String PK_ANTWORT;
    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name="FK_FRAGE", nullable=false)
    Frage frage;
    Boolean RICHTIG;
}
