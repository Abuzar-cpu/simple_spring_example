package az.ingress.ms15demo.services;

import az.ingress.ms15demo.entities.LogUser;
import az.ingress.ms15demo.entities.User;
import az.ingress.ms15demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor // This creates a constructor for all final fields which means constructor injection in this example
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public User addUser(User user) {
        var logUser = this.modelMapper.map(user, LogUser.class);
        if(user.getAge() < 18) {
            log.info("User does not meet age requirements: {}", logUser);
            return null;
        }
        this.userRepository.addUser(user);
        log.info("Adding user: {}", logUser);
        return user;
    }
}
