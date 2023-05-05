package az.ingress.ms15demo.services;

import az.ingress.ms15demo.entities.User;
import az.ingress.ms15demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // This creates a constructor for all final fields which means constructor injection in this example
public class UserService {
    private final UserRepository userRepository;

    public User addUser(User user) {
        if(user.getAge() < 18)
            return null;

        this.userRepository.addUser(user);
        return user;
    }
}
