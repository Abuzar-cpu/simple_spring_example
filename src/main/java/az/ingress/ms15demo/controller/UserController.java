package az.ingress.ms15demo.controller;

import az.ingress.ms15demo.model.User;
import az.ingress.ms15demo.model.response.DeleteUserResponse;
import az.ingress.ms15demo.model.response.GetUserResponse;
import az.ingress.ms15demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/users/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }

    @GetMapping("{id}")
    public GetUserResponse getUserById(@PathVariable Integer id) {
        return this.userService.getUserById(id);
    }

    @GetMapping()
    public List<GetUserResponse> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public DeleteUserResponse deleteById(@PathVariable Integer id) {
        return this.userService.deleteUserById(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Integer id, User user) {
        this.userService.updateUser(id, user);
    }
}
