package az.ingress.ms15demo.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@NoArgsConstructor
public class User {
    String name;
    Integer age;
    String FIN;
}
