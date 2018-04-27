package pl.bolka.aleksander.demoAngularSpringGameBackend.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.bolka.aleksander.demoAngularSpringGameBackend.api.model.CharacterDTO;
import pl.bolka.aleksander.demoAngularSpringGameBackend.domain.model.Character;

@Mapper
public interface CharacterMapper {

    CharacterMapper INSTANCE = Mappers.getMapper(CharacterMapper.class);

    CharacterDTO characterToCharacterDTO(Character character);

}
