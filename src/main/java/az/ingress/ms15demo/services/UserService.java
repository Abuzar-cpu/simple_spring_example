package az.ingress.ms15demo.services;

import az.ingress.ms15demo.model.LogUser;
import az.ingress.ms15demo.model.User;
import az.ingress.ms15demo.model.response.DeleteUserResponse;
import az.ingress.ms15demo.model.response.GetUserResponse;
import az.ingress.ms15demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
// This creates a constructor for all final fields which means constructor injection in this example
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public User addUser(User user) {
        var logUser = this.modelMapper.map(user, LogUser.class);
        if (user.getAge() < 18) {
            log.info("User does not meet age requirements: {}", logUser);
            return null;
        }
        this.userRepository.addUser(user);
        log.info("Adding user: {}", logUser);
        return user;
    }

    public GetUserResponse getUserById(Integer id) {
        var user = modelMapper.map(this.userRepository.getById(id), GetUserResponse.class);
        if (user == null) {
            log.info("User not found with id {}", id);
            return null;
        }

        log.info("User found: {}", modelMapper.map(user, LogUser.class));
        return user;
    }

    public List<GetUserResponse> getAllUsers() {
        log.info("Returning all users");
        var users = this.userRepository.getAllUsers();
        return users.stream().map(user -> modelMapper.map(user, GetUserResponse.class)).toList();
    }

    public DeleteUserResponse deleteUserById(Integer id) {
        var deleted = this.userRepository.deleteUserById(id);
        log.info("User deleted: {}", modelMapper.map(deleted, LogUser.class));

        return modelMapper.map(deleted, DeleteUserResponse.class);
    }

    public void updateUser(Integer id, User user) {
        if (this.userRepository.getById(id) == null) {
            log.info("User not found with id {}", id);
            return;
        }

        log.info("User updated with id {}", id);
        this.userRepository.updateUser(id, user);
    }
}
