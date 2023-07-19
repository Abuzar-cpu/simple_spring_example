package az.ingress.msdemo.controller;

import az.ingress.msdemo.model.entities.User;
import az.ingress.msdemo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("{id}")
    public User getUserById(@PathVariable Long id) {
        return this.userService.getUserById(id);
    }

    @PostMapping("")
    public void saveUser(@RequestBody User user) {
        this.userService.saveUser(user);
    }
}
