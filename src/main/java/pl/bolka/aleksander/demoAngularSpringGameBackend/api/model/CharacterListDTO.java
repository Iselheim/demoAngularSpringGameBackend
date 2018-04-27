package pl.bolka.aleksander.demoAngularSpringGameBackend.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CharacterListDTO {

    private List<CharacterDTO> characters;

}
