package az.ingress.ms15demo.exceptions;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@ToString
public class ErrorResponse {
    String message;
}
