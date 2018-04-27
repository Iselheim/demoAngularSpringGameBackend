package pl.bolka.aleksander.demoAngularSpringGameBackend.api.mapper;

import org.junit.Test;
import pl.bolka.aleksander.demoAngularSpringGameBackend.api.model.CharacterDTO;
import pl.bolka.aleksander.demoAngularSpringGameBackend.domain.model.Character;

import static org.junit.Assert.*;

public class CharacterMapperTest {

    @Test
    public void fromCharacterToCharacterDTO() {
        Character character = new Character();
        character.setId(1l);
        character.setName("name");
        character.setPower(20);
        CharacterDTO characterDTO = CharacterMapper.INSTANCE.characterToCharacterDTO(character);
        assertEquals("name", characterDTO.getName());
        assertEquals(1l, (long) characterDTO.getId());
        assertEquals(20, (int) characterDTO.getPower());
    }

}