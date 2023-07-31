package az.ingress.msdemo.services;

import az.ingress.msdemo.exceptions.NotFoundException;
import az.ingress.msdemo.model.entities.dtos.GetUserResponse;
import az.ingress.msdemo.repository.UserRepository;
import az.ingress.msdemo.util.UserEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static az.ingress.msdemo.model.entities.enums.ErrorMessages.NOT_FOUND;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepo;

    public GetUserResponse getUserById(Long id) {
        var response = this.userRepo.findUserById(id);
        if (response == null)
            throw new NotFoundException(NOT_FOUND.getMessage());

        return UserEntityMapper.mapEntityToGetUserResponse(response);
    }
}
