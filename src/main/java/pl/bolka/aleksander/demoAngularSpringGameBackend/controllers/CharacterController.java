package pl.bolka.aleksander.demoAngularSpringGameBackend.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.bolka.aleksander.demoAngularSpringGameBackend.api.model.CharacterDTO;
import pl.bolka.aleksander.demoAngularSpringGameBackend.services.CharacterService;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class CharacterController {

    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public ResponseEntity<List<CharacterDTO>> getAllCategories() {
        return new ResponseEntity<>(
                characterService.getAllCharacters(), HttpStatus.OK);

    }

}


