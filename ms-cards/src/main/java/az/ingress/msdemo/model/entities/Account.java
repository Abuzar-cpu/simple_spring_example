package az.ingress.msdemo.model.entities;


import az.ingress.msdemo.model.entities.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @ToString.Exclude
    private Card card;

    private Integer balance;

    @CreationTimestamp
    private LocalDate accountOpenDate = LocalDate.now();

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;
    private String accountHolderName;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private User user;

}