package pl.bolka.aleksander.demoAngularSpringGameBackend.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import pl.bolka.aleksander.demoAngularSpringGameBackend.api.model.CharacterDTO;
import pl.bolka.aleksander.demoAngularSpringGameBackend.services.CharacterService;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.mockito.Mockito.when;

public class CharacterControllerTest {

    @Mock
    CharacterService characterService;

    @InjectMocks
    CharacterController characterController;

    MockMvc mockMvc;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(characterController).build();
    }

    @Test
    public void testListCharacters() throws Exception {
        CharacterDTO character = new CharacterDTO();
        character.setId(1l);
        character.setName("name1");
        character.setPower(20);

        CharacterDTO character1 = new CharacterDTO();
        character1.setId(2l);
        character1.setName("name2");
        character1.setPower(30);

        List<CharacterDTO> characters = Arrays.asList(character, character1);

        when(characterService.getAllCharacters()).thenReturn(characters);

        mockMvc.perform(get("/api/characters/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.characters", hasSize(2)));
    }

}