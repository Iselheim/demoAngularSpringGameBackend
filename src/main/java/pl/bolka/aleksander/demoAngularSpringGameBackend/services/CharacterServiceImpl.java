package pl.bolka.aleksander.demoAngularSpringGameBackend.services;

import org.springframework.stereotype.Service;
import pl.bolka.aleksander.demoAngularSpringGameBackend.api.mapper.CharacterMapper;
import pl.bolka.aleksander.demoAngularSpringGameBackend.api.model.CharacterDTO;
import pl.bolka.aleksander.demoAngularSpringGameBackend.repositories.CharacterRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CharacterServiceImpl implements CharacterService {

    private CharacterMapper characterMapper;
    private CharacterRepository characterRepository;

    public CharacterServiceImpl( CharacterRepository characterRepository) {
        this.characterMapper = CharacterMapper.INSTANCE;
        this.characterRepository = characterRepository;
    }

    @Override
    public List<CharacterDTO> getAllCharacters() {
        return characterRepository.findAll()
                .stream()
                .map(characterMapper::characterToCharacterDTO)
                .collect(Collectors.toList());
    }
}
