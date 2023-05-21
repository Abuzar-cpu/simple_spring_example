package az.ingress.ms15demo.repository;

import az.ingress.ms15demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    private static final Map<Integer, User> db = new HashMap<>();
    private static int counter = 0;

    public static void preload() {
        for (int i = 0; i < 10; i++) {
            var user = User.builder().age(24 + counter).name("Test " + counter).FIN(UUID.randomUUID().toString()).build();
            db.put(counter++, user);
        }
    }

    public void addUser(User user) {
        db.put(counter++, user);
    }

    public User getById(Integer id) {
        return db.get(id);
    }

    public List<User> getAllUsers() {
        List<User> result = new ArrayList<>();
        db.forEach((integer, user) -> result.add(user));
        return result;
    }

    public User deleteUserById(Integer id) {
        return db.remove(id);
    }

    public void updateUser(Integer id, User user) {
        db.put(id, user);
    }
}
