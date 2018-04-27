package pl.bolka.aleksander.demoAngularSpringGameBackend.services;

import pl.bolka.aleksander.demoAngularSpringGameBackend.api.model.CharacterDTO;

import java.util.List;

public interface CharacterService {

    List<CharacterDTO> getAllCharacters();
}
