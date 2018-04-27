package pl.bolka.aleksander.demoAngularSpringGameBackend.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.bolka.aleksander.demoAngularSpringGameBackend.api.mapper.CharacterMapper;
import pl.bolka.aleksander.demoAngularSpringGameBackend.api.model.CharacterDTO;
import pl.bolka.aleksander.demoAngularSpringGameBackend.repositories.CharacterRepository;
import pl.bolka.aleksander.demoAngularSpringGameBackend.domain.model.Character;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class CharacterServiceTest {

    CharacterService characterService;

    @Mock
    CharacterRepository characterRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        characterService = new CharacterServiceImpl(characterRepository);
    }

    @Test
    public void getAllCharacters() {

        List<Character> characters = Arrays.asList(new Character(), new Character(), new Character());

        when(characterRepository.findAll()).thenReturn(characters);

        List<CharacterDTO> allCharacters = characterService.getAllCharacters();

        assertEquals(3, allCharacters.size());
    }
}