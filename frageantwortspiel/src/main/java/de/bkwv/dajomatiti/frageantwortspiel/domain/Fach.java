package de.bkwv.dajomatiti.frageantwortspiel.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
@Data
public class Fach{
    @Id
    String PK_FACH;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "fach")
    Collection<Thema> themenliste;

}