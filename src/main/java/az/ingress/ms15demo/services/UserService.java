package az.ingress.ms15demo.services;

import az.ingress.ms15demo.exceptions.NotFoundException;
import az.ingress.ms15demo.exceptions.UserAlreadyExistsException;
import az.ingress.ms15demo.model.*;
import az.ingress.ms15demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

import static az.ingress.ms15demo.model.enums.ExceptionMessages.USER_ALREADY_EXISTS;
import static az.ingress.ms15demo.model.enums.ExceptionMessages.USER_NOT_FOUND;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    public List<GetUserResponse> getUserByName(String name) {
        var user = this.userRepository.getUserByName(name);
        if (user == null) {
            log.info("Action.getUserByName.info -- user not found with name: {}", name);
            throw new NotFoundException(USER_NOT_FOUND.getMessage());
        }

        log.info("Action.getUserByName.success -- returning user: {}", name);
        return user.stream().map(u -> this.modelMapper.map(u, GetUserResponse.class)).toList();
    }

    public CreateUserResponse createUser(CreateUserRequest user) {
        if (this.userRepository.findByFIN(user.getFIN()).isPresent()) {
            log.error("Action.createUser.error -- user already exists: {}", user);
            throw new UserAlreadyExistsException(USER_ALREADY_EXISTS.getMessage());
        }
        var newUser = this.modelMapper.map(user, User.class);
        var created = userRepository.save(newUser);

        log.info("Action.createUser.success -- creating user: {}", newUser);
        return this.modelMapper.map(created, CreateUserResponse.class);
    }

    public GetUserResponse getUserById(Long id) {
        var user = this.userRepository.findById(id).orElseThrow(() -> {
            log.error("Action.getUserById.error -- user not found: {}", id);
            return new NotFoundException(USER_NOT_FOUND.getMessage());
        });

        log.info("Action.getUserById.success -- found user: {}", id);
        return this.modelMapper.map(user, GetUserResponse.class);
    }

    public GetUserResponse getUserByFin(String fin) {

        var user = this.userRepository.findByFIN(fin).orElseThrow(() -> {
            log.error("Action.getUserByFin.error -- user not found: {}", fin);
            return new NotFoundException(USER_NOT_FOUND.getMessage());
        });

        log.info("Action.getUserByFin.success -- found user: {}", fin);
        return this.modelMapper.map(user, GetUserResponse.class);
    }

    public void deleteById(Long id) {
        log.info("Action.deleteById.success -- deleting user: {}", id);
        this.userRepository.deleteById(id);
    }

    public GetUserResponse updateUserByFIN(UpdateUserByFinRequest user) {
        var existing = this.getUserByFin(user.getFIN());

        var updated = this.modelMapper.map(user, User.class);
        updated.setId(existing.getId());
        this.userRepository.save(updated);

        return this.modelMapper.map(updated, GetUserResponse.class);
    }

}
