package pl.bolka.aleksander.demoAngularSpringGameBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bolka.aleksander.demoAngularSpringGameBackend.domain.model.Character;

public interface CharacterRepository extends JpaRepository<Character,Long> {
}
