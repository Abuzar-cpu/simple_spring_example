package az.ingress.ms15demo.repository;

import az.ingress.ms15demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
    Optional<User> findByFIN(String FIN);

    @Query("select u from User u where u.name=:name")
    List<User> getUserByName(String name);
}
