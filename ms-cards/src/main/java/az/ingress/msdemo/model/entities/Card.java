package az.ingress.msdemo.model.entities;

import az.ingress.msdemo.model.entities.enums.CardStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    @ToString.Exclude
    private Account account;

    private String cardNumber;
    private LocalDate expirationDate;
    private int cvv;

    @Enumerated(EnumType.STRING)
    private CardStatus status;
}