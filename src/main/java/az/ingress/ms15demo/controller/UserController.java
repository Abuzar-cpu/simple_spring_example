package az.ingress.ms15demo.controller;

import az.ingress.ms15demo.model.CreateUserRequest;
import az.ingress.ms15demo.model.CreateUserResponse;
import az.ingress.ms15demo.model.GetUserResponse;
import az.ingress.ms15demo.model.UpdateUserByFinRequest;
import az.ingress.ms15demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/users/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CreateUserResponse addUser(@RequestBody CreateUserRequest user) {
        return userService.createUser(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("id/{id}")
    public GetUserResponse getUserById(@PathVariable Long id) {
        return this.userService.getUserById(id);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("name/{name}")
    public List<GetUserResponse> getUserById(@PathVariable String name) {
        return this.userService.getUserByName(name);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("fin/{FIN}")
    public GetUserResponse findByFIN(@PathVariable String FIN) {
        return this.userService.getUserByFin(FIN);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT) // :D
    public void deleteById(@PathVariable Long id) {
        this.userService.deleteById(id);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("")
    public GetUserResponse updateUserByFIN(@RequestBody UpdateUserByFinRequest user) {
        return this.userService.updateUserByFIN(user);
    }
}
