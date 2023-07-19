package az.ingress.msdemo.services;

import az.ingress.msdemo.model.entities.User;
import az.ingress.msdemo.model.entities.dtos.GetUserResponse;
import az.ingress.msdemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepo;
    public User getUserById(Long id) {
        var response = this.userRepo.findUserById(id);
        response.getAccountList();
        return response;
    }

    public void saveUser(User user) {
        this.userRepo.save(user);
    }
}
