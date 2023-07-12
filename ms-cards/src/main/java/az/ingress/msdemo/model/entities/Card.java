package az.ingress.msdemo.model.entities;

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

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "card", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Account account;
    private String cardNumber;
    private LocalDate expirationDate;
    private int cvv;
    private Integer status;
}
