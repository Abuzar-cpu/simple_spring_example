package az.ingress.msdemo.repository;

import az.ingress.msdemo.model.entities.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(value = "UserEntityGraph")
    User findUserById(Long id);
}
