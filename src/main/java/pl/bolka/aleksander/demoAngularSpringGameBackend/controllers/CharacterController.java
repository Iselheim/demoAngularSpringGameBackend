package pl.bolka.aleksander.demoAngularSpringGameBackend.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.bolka.aleksander.demoAngularSpringGameBackend.api.model.CharacterListDTO;
import pl.bolka.aleksander.demoAngularSpringGameBackend.services.CharacterService;

@Controller
@RequestMapping("/api/characters")
public class CharacterController {

    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public ResponseEntity<CharacterListDTO> getAllCategories() {
        return new ResponseEntity<CharacterListDTO>(
                new CharacterListDTO(characterService.getAllCharacters()), HttpStatus.OK);

    }

}


