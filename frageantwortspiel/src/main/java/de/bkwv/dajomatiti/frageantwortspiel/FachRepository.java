package de.bkwv.dajomatiti.frageantwortspiel;

import de.bkwv.dajomatiti.frageantwortspiel.domain.Fach;
import de.bkwv.dajomatiti.frageantwortspiel.domain.Thema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FachRepository extends JpaRepository<Fach, String> {



}
