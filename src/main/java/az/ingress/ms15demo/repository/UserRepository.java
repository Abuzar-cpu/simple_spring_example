package az.ingress.ms15demo.repository;

import az.ingress.ms15demo.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void addUser(User user) {
        System.out.println("(Database layer) adding user: " + user);
    }
}
