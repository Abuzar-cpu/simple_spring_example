package az.ingress.msdemo.model.entities;

import az.ingress.msdemo.model.entities.enums.UserStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@NamedEntityGraph(
        name = "UserEntityGraph",
        attributeNodes = {
                @NamedAttributeNode("accountList")
        }
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;
    private String address;

    @OneToMany(
            orphanRemoval = true,
            mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @ToString.Exclude
    @JsonIgnore
    private List<Account> accountList;

    @Enumerated(EnumType.STRING)
    private UserStatus status;
}