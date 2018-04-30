package pl.bolka.aleksander.demoAngularSpringGameBackend.utils.init;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.bolka.aleksander.demoAngularSpringGameBackend.domain.model.Character;
import pl.bolka.aleksander.demoAngularSpringGameBackend.repositories.CharacterRepository;

@Component
public class InitDatabase implements ApplicationListener<ContextRefreshedEvent> {

    private CharacterRepository characterRepository;

    public InitDatabase(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Character character = new Character();
        character.setId(1l);
        character.setName("first character");
        character.setPower(20);

        Character character2 = new Character();
        character2.setId(2L);
        character2.setName("second character");
        character2.setPower(10);

        characterRepository.save(character);
        characterRepository.save(character2);
    }

}
