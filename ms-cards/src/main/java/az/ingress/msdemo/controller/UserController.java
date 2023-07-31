package az.ingress.msdemo.controller;

import az.ingress.msdemo.model.entities.dtos.GetUserResponse;
import az.ingress.msdemo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("{id}")
    public GetUserResponse getUserById(@PathVariable Long id) {
        return this.userService.getUserById(id);
    }

}
