package az.ingress.ms15demo.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@NoArgsConstructor
public class GetUserResponse {
    String name;
    Integer age;
    String FIN;
    Long id;
}
