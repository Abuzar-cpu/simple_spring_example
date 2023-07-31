package az.ingress.ms15demo

import az.ingress.ms15demo.model.User
import az.ingress.ms15demo.repository.UserRepository
import az.ingress.ms15demo.services.UserService
import io.github.benas.randombeans.EnhancedRandomBuilder
import io.github.benas.randombeans.api.EnhancedRandom
import org.modelmapper.ModelMapper
import spock.lang.Specification

class UserServiceTest extends Specification {

    private EnhancedRandom random = EnhancedRandomBuilder.aNewEnhancedRandom();
    private UserService userService;
    private UserRepository userRepo;
    private ModelMapper modelMapper = new ModelMapper();

    def setup() {
        userRepo = Mock();
        userService = new UserService(userRepo, modelMapper);
    }

    def "getUserByName success case"() {
        given:
        def name = random.nextObject(String.class);
        def entity = random.nextObject(User.class);
        when:
        userService.getUserByName(name);
        then:
        1 * userRepo.findUserByName(name) >> List.of(entity)
    }

    def "getUserById success case"() {
        given:
        def id = random.nextObject(Integer.class)
        def entity = random.nextObject(User.class)
        when:
        userService.getUserById(id)
        then:
        1 * userRepo.findById(id) >> Optional.of(entity)
    }
}
